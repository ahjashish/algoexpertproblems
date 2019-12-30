import java.util.*;

class YoungestCommonAncestorRecursive {
    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne,
            AncestralTree descendantTwo) {
        Set<Character> branchNames = new HashSet<>();
        populateBranchTreeNames(branchNames, descendantOne);
        System.out.println(branchNames);
        return findYongestAncestor(topAncestor, branchNames, descendantTwo);
    }

    static AncestralTree findYongestAncestor(AncestralTree root, Set<Character> names, AncestralTree node2) {
        if (node2 == null) {
            return root;
        }
        if (node2 == root) {
            return root;
        }
        if (names.contains(node2.name)) {
            return node2;
        }
        return findYongestAncestor(root, names, node2.ancestor);
    }

    static void populateBranchTreeNames(Set<Character> branchNames, AncestralTree node1) {
        if (node1 == null) {
            return;
        }
        branchNames.add(node1.name);
        populateBranchTreeNames(branchNames, node1.ancestor);
    }

    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }
}
