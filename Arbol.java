public class Arbol {
    
    public Arbol root; 

    public Arbol(){
        root = null; 
    }


    public Arbol regresarnodo(){
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

        public void preOrder() {
        preOrder(root);
    }

          // using the function ...
       public void preOrder(Nodo root) {
         if (root != null) {            

       System.out.println(root.getWord());   // root
       preOrder(root.getLeft());        // left
       preOrder(root.getRight());       // right
}

       }
}
