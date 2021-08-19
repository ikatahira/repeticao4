public class ExercicioRepeticao4{
    public static void main(String args[]){
        int fatorial=1;
        for(int i=1; i<=10;i++){
            for(int j=1; j<=i;j++){
                fatorial=fatorial*j;
            }
            System.out.println(fatorial);
            fatorial=1;
        }
    }

}

//4. Imprima os fatoriais de 1 a 10.
//fatorial de 1 é 1
//fatorial de 2 é 2*1
//fatorial de 3 é 3*2*1
//ufa solução encontrada!!!!