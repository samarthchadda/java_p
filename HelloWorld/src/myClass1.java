class myClass1 {

    int instVar;
    myClass1(int instVar){
        this.instVar = instVar;        
    }

    public static void main(String[] args) {
        myClass1 obj = new myClass1(8);
        System.out.println("obj.instVar = " + obj.instVar);
    }
}