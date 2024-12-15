package day18;

public class Node {
    private Integer value;
    private Node leftNode;
    private Node rightNode;

    public void addNodeToTree(int value, Node node){
        if (node.getValue() == null) {
            node.setValue(value);
        }else{
            Node nodeToBeAdded = new Node();
            nodeToBeAdded.setValue(value);
            if(nodeToBeAdded.getValue() < node.getValue()){
                if (node.getLeftNode() == null) {
                    node.setLeftNode(nodeToBeAdded);
                    System.out.println("ParentOfTheLeftNode.Value = " + node.value + " - childLeftNode = " + value);
                } else {
                    System.out.println("value = " + node.value + " - childLeftNode = " + value);
                    addNodeToTree(value, node.getLeftNode());
                }
            } else{
                if (node.getRightNode() == null) {
                    node.setRightNode(nodeToBeAdded);

                } else {
                    addNodeToTree(value, node.getRightNode());
                }
            }

        }
    }

    public void dfs(Node node){
        if(node.getLeftNode() != null) {
            dfs(node.getLeftNode());
        }
        System.out.print(node.getValue()  + " -> ");
        if (node.getRightNode() != null) {
            dfs(node.getRightNode());
        }
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Integer getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }
}
