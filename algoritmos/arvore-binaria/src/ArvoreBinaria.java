import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArvoreBinaria {

    public ArvoreBinaria(){
        try {
            File txt = new File("src/agenda.txt");
            var arrayList = ArrayOrdenado(txt);
    
            var inicio = 0;
            var fim = arrayList.size() - 1;
            var meio = (inicio + fim) / 2;

            Imprimir(arrayList);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
    }

    public ArrayList<String> ArrayOrdenado(File txt) throws FileNotFoundException{
        try {
            Scanner ler = new Scanner(txt);

            ArrayList <String> arrayList = new ArrayList<String>();

            while(ler.hasNext()){
                arrayList.add(ler.nextLine());
            }
           Collections.sort(arrayList);
            ler.close();
            return arrayList;
        } 
        catch (Exception e) {
           throw new FileNotFoundException("Arquivo nÃ£o encontrado");

        }
    }
    public void Imprimir(ArrayList<String> arrayList){
        for (String string : arrayList) {
            System.out.println(string  );
        }
    }

}