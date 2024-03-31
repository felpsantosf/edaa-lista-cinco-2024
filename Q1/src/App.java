public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
                      306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
                      355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
                      391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
                      429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
                      483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
                      511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
                      554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
                      613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
                      652, 654, 655, 662, 667, 671, 673, 674, 695, 696
             };
             //Questão1 A
            int indice = buscaBinaria(arr, 415);
            System.out.println(indice);
            //letra B
            int indice1 = buscaBinaria(arr, 545);
            System.out.println(indice1);
            //letra c
            int indice2 = buscaBinaria(arr, 390);
            System.out.println(indice2);
            //letra d
            int indice3 = buscaBinaria(arr, 609);
            System.out.println(indice3);
            //letra e
            int indice4 = buscaBinaria(arr, 296);
            System.out.println(indice4);
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
