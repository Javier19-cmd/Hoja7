public class Tree {

    public Nodo root;    

    public Tree(){

        root = null;

    }

        public Nodo returnRoot(){
            return root;
        }

    public boolean isEmpty(){

        return root == null;

    }

    public void insert(String value){

        if(isEmpty()){

            root = new Nodo(value);

        }else{

            root.add(value);

        }
    }
        public Nodo getRoot(){
            return root;
        }

         public void inOrder() {
          inOrder(root);
    }

          // using the function ...
       public void inOrder(Nodo root) {
         if (root != null) {            

       inOrder(root.getLeft());        // left
       System.out.println(root.getWord());   // root
       inOrder(root.getRight());       // right
    }

    }
}