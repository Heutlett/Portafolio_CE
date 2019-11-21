public class ListaSimple {

    private Node first;

    public ListaSimple(){
        first = null;
    }

    public void addFirst(int element){

        if(this.first == null){
            this.first = new Node(element);
        }else{
            Node temp = this.first;
            this.first = new Node(element);
            this.first.next = temp.next;
            temp.next = null;
        }

    }

    public void print(){

        Node temp = this.first;

        while(temp != null){
            System.out.println(temp.element);
            temp = temp.next;
        }



    }

}
