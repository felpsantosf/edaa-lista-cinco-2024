public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
            178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
            243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
            317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
            396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
            443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
            525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
            626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
            723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
            824, 826, 832, 848, 854, 856, 858, 867, 873, 880
            };
               //Questão1 A
               int indice = buscaBinaria(arr, 824);
               System.out.println(indice);
               //letra B
               int indice1 = buscaBinaria(arr, 599);
               System.out.println(indice1);
               //letra c
               int indice2 = buscaBinaria(arr, 700);
               System.out.println(indice2);
               //letra d
               int indice3 = buscaBinaria(arr, 858);
               System.out.println(indice3);
               //letra e
               int indice4 = buscaBinaria(arr, 269);
               System.out.println(indice4);
               //letra f
               int indice5 = buscaBinaria(arr, 351);
               System.out.println(indice5);
               //letra g
               int indice6 = buscaBinaria(arr, 42);
               System.out.println(indice6);
               //letra h
               int indice7 = buscaBinaria(arr, 317);
               System.out.println(indice7);
               //letra i
               int indice8 = buscaBinaria(arr, 525);
               System.out.println(indice8);
               //letra j
               int indice9 = buscaBinaria(arr, 550);
               System.out.println(indice9);
               //letra k
               int indice10 = buscaBinaria(arr, 143);
               System.out.println(indice10);
               //letra l
               int indice11 = buscaBinaria(arr, 421);
               System.out.println(indice11);
               //letra m
               int indice12 = buscaBinaria(arr, 422);
               System.out.println(indice12); 


       }
       public static int buscaBinaria(int[] lista, int chave) {
           int inicio = 0;
           int fim = lista.length - 1;
     
           while (inicio <= fim) {
               int meio = (inicio + fim) / 2;
     
               if (lista[meio] == chave) {
                   return meio; 
               } else if (lista[meio] < chave) {
                   inicio = meio + 1; 
               } else {
                   fim = meio - 1; 
               }
           }
     
           return -1; 
     }
    }


