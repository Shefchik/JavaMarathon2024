package day18;

public class Task3 {
    public static void main(String[] args){
        int [] numbers = {5, 8, 11, 14, 15, 16, 18, 20, 22, 23, 24, 27, 150};

        Node node = new Node();
        for(int counter = 0; counter < numbers.length; counter++){
            node.addNodeToTree(numbers[counter], node);
        }
        node.dfs(node);
    }
}
