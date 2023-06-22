import clales.dos.tres.Cuatro;

public class Uno{
    protected static class Dos{
        private int edad;
        private String nombre;
        private String direcccion;
        public Dos(){}
        public void setDirecccion(String direcccion) {
            this.direcccion = direcccion;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getDirecccion() {
            return direcccion;
        }
        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }

    }
    public static void main(String[] args) {
            //Uno.Dos d1 = new Dos();
            Cuatro c4= new Cuatro();
            Cuatro c5= new Cuatro();
             int t1=0;           
            System.out.println(c4.mres(2,2));
            System.out.println(c4.edo);
            Cuatro.inc();
            if(c5.edo >0){
                t1=2;
                System.out.println(c5.edo);
            } else{

            }
            int _u=0;
             System.out.println(t1);
             {

             }
          int u2=9; 
          String msg=(9%2==0)? "par":"impar";
         System.out.println((8%2==0)? "par":"impar");
            
            //d1.setNombre("Gabriela");
           
    }

}