public class List<T extends Comparable<T>> {
    private Node<T> root;


    public void insert(T data){
        if (root == null) {
            root = new Node<>(data);
        } else {
            Node<T> newNode = new Node<>(data);
            if (data.compareTo(root.data) < 0) {
                newNode.next = root;
                root = newNode;
                //System.out.println(root);
            } else {
                root.insert(newNode);
            }
        }

    }

    public String remove(T data){
        if(root == null){
            return "Element not found";
        } else {
            if (data.compareTo(root.data) == 0) {
                root=root.next;
                return "Element Succesfully removed";
            } else {
                return root.remove(data);
            }
        }
    }

    public String toString(){
        return root.stringifyList();
    }

    private class Node<S extends Comparable<S>> {
        private S data;
        private Node next;

        private Node(S data){
            this.data = data;
            this.next = null;
        }

        private void insert(Node<S> tNode) {
            if (next == null) {
                next = tNode;
            } else if (next.data.compareTo(tNode.data) < 0) {
                next.insert(tNode);
            } else if (next.data.compareTo(tNode.data) > 0) {
                tNode.next = next;
                next = tNode;
            }
        }

        private String stringifyList() {
            if (next == null) {
                return Node.this.toString();
            } else {
                return Node.this.toString() + "\n" + next.stringifyList();
            }
        }

        private String remove(S data){
            if (next != null && next.data.compareTo(data)==0){
                next=next.next;
                return "Element succesfully removed";
            } else {
                if (next==null) {
                    return "Element not found";
                }
                else{
                    return next.remove(data);
                }
            }
        }


        @Override
        public String toString() {
            return "\t" + data.toString();
        }
    }
}
