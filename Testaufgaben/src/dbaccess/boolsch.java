package dbaccess;

// import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

class boolsch{
    public enum Operations{
        AND{
            public boolean value(boolean x, boolean y){ return x && y;};
        },
        OR{
            public boolean value(boolean x, boolean y){ return x || y;};
        },
        EQUALS{
            public boolean value(boolean x, boolean y){ return x == y;};
        },
        NEQUALS{
            public boolean value(boolean x, boolean y){ return x != y;};
        };
        public abstract boolean value(boolean x, boolean y);

    }
 
    public static boolean recursive_print(int max_counts, int current_count, boolean[] values, Operations[] ops){
        if(current_count++ >= max_counts)
            return true;
           
        for(int c = 0; c < values.length; c++){
            System.out.print( values[c] + "\t");

        }
        
        for(int j = 1; j < values.length; j++){
            for(int jj = j; jj < values.length; jj++){
                for(int i = 0; i < ops.length; i++){
                    System.out.print( ops[i].value(values[(j-1)],values[jj])+ "\t" );
                } 
            }
        }

        System.out.println();
 
        // Flip Values in Place
        for(int j = values.length - 1; j >=0; j--){
            int flip_index = (int)Math.abs(values.length - 1 - j);
            if(current_count % Math.pow(2,flip_index) == 0)
                values[j] ^= true; 
        }
    
        return recursive_print(max_counts, current_count, values, ops);
    }

    public static void main(String[] args){
        System.out.println("Bitte gib die Anzahl der Variablen an: ");
        /*
         * Hier wird die Anzahl der Variablen vom Nutzer geholt
         * die für die Wertetabelle genutzt werden soll
         * Dabei zwischen 2 und 26 um vom array index zum ASCII Char zu konvertieren
         */
        boolean should_check = true;
        int value_count = 0;
        Scanner input = new Scanner(System.in);
        while(should_check){
            try{
                value_count = input.nextInt();
                if(value_count < 2 || value_count > 26){
                    System.out.println("Bitte eine Zahl zwischen 2 und 26 angeben\nBitte erneut Zahl eingeben:");
                    continue;
                }
                should_check = false; 
            }catch(InputMismatchException e){
                System.out.println("Nur Zahlen als Argument erlaubt!\nBitte erneut ein Zahl eingeben:" );
                input.next();
            }
        } 
        input.close();
        // Array mit Random Boolschen Werten erzeugen
        boolean[] value = new boolean[value_count]; 

        // Tabellenkopf ausgeben
        String operation_as_string[] = {"&&","||","==","!="};
        Operations[] ops = Operations.values();

        int tmp_counter = 0, op_len = operation_as_string.length;

        for(int c = 0; c < value_count ; c++)
            System.out.print((char)(65+c) + "\t");
        
        for(int j = 1; j < value_count; j++){
            for(int jj = j; jj < value_count; jj++){
                for(int i = 0; i < op_len; i++){
                    System.out.print( (char)(65 + j - 1) + operation_as_string[i] + (char)(65+ jj) + "\t" );
                } 
            }
        }
        // Iterate Boolean Werte
        System.out.print("\r\n");
        recursive_print( (int)Math.pow(2,value_count),0, value, ops );
        //recursive((int)Math.pow(2,value_count), 0, value, ops );
    }
}
