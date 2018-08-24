import java.util.ArrayList;
public class Node {
    Object data;
    ArrayList<Node> connections;
    public Node(Object data, ArrayList<Node> connections){
        this.data=data;
        this.connections=connections;
    }
    public String toString(){
        return "data: "+data+" connections:"+connections.size();
    }
    public Object getData(){return data;}
    public ArrayList<Node> getConnections(){return connections;}
    public void setData(Object o){this.data=o;}
    public void setConnection(int i, Node n){connections.set(i,n);}
    public void addConnection(Node n){connections.add(n);}
    public void removeConnection(int i){connections.remove(i);}
}
