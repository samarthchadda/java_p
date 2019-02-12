class myClass {

    int instVar;
    myClass(int instVar){
        instVar = instVar;        //no effect
    }

    public static void main(String[] args) {
        myClass obj = new myClass(8);
        System.out.println("obj.instVar = " + obj.instVar);
    }
}