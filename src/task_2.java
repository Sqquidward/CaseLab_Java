public class task_2 {
    Construct replacement(int a, int b){
        a = a+b;
        b = b-a;
        a = a+b;
        b = -b;
        return new Construct(a, b);
    }
}

class Construct{
    int a;
    int b;
    public Construct(int a, int b){
        this.a = a;
        this.b = b;
    }
}
