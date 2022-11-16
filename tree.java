public class tree {
    public static void main(String[] params) {
        Tree root =
                new Tree(15,
                        new Tree(62,
                                new Tree(4, null, new Tree(1)), new Tree(7)),
                        new Tree(99,
                                new Tree(11, new Tree(88), null),
                                new Tree(80, new Tree(2), new Tree(9))));

        System.out.println("Сумма дерева: " + root.sum());
        System.out.println(root.value);
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        }

        public int sum() {
            int summ = value;

            if (left != null) {
                summ += left.sum();
                System.out.println(left.value);
            }

            if (right != null) {
                summ += right.sum();
                System.out.println(right.value);
            }
            return summ;
        }
    }
}