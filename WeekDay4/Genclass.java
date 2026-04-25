class box<T> {
    T value;
     void setValue(T value){
        this.value = value;
     }
     void printValue(){
        System.out.println(value);
     }
}


public class Genclass {
    public static void main(String[] args) {
      box <Integer> intValue = new box<>() ;
      intValue.setValue(100);
      intValue.printValue();

      
      box <String> strvalue = new box<>();
      strvalue.setValue("Hello Java");
      strvalue.printValue();
    }
}
