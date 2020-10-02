package SamplePrograms;

public class Example1{
    
    public static void main(String[] args){
        int x[] = {67, 7, 45, 
        int abc[] = new int[5], xyz[];
        xyz = abc;
        abc[4] = 50;
        System.out.println(xyz[4]);
        xyz[1] = 99;
        for(int i = 0; i < abc.length; i++){
            System.out.format("abc[%d] = %d\n", i, abc[i]);
        }
        x[1] = 100;
        int ii = 4;
        x[ii - 1] = 94;
        for(int i = 0; i < x.length; i++){
            System.out.format("x[%d] = %d\n", i, x[i]);
            if(x[i]==7){
            }
            count7++;
        }
        System.out.println("Adding 5th assignment");
    }
}