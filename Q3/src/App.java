import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {
            1008 ,1012 ,1014 ,1021 ,1026 ,1028 ,1035 ,1040 ,1046 ,1051,
            1052 ,1054 ,1062 ,1069 ,1072 ,1076 ,1078 ,1081 ,1082 ,1084,
            1089 ,1095 ,1102 ,1105 ,1113 ,1122 ,1132 ,1135 ,1139 ,1146,
            1151 ,1154 ,1170 ,1171 ,1174 ,1178 ,1180 ,1191 ,1202 ,1203,
            1208 ,1210 ,1223 ,1225 ,1233 ,1234 ,1236 ,1237 ,1243 ,1255,
            1263 ,1279 ,1286 ,1287 ,1288 ,1296 ,1304 ,1307 ,1309 ,1313,
            1315 ,1319 ,1324 ,1326 ,1332 ,1340 ,1355 ,1356 ,1358 ,1365,
            1367 ,1370 ,1371 ,1374 ,1377 ,1383 ,1386 ,1392 ,1396 ,1397,
            1398 ,1413 ,1423 ,1433 ,1434 ,1437 ,1440 ,1442 ,1448 ,1463,
            1464 ,1466 ,1472 ,1475 ,1477 ,1483 ,1484 ,1487 ,1489 ,1492,
            1493 ,1494 ,1503 ,1504 ,1506 ,1509 ,1515 ,1516 ,1518 ,1521,
            1528 ,1536 ,1542 ,1544 ,1546 ,1555 ,1562 ,1563 ,1567 ,1576,
            1579 ,1589 ,1597 ,1607 ,1610 ,1612 ,1613 ,1620 ,1622 ,1623,
            1629 ,1633 ,1636 ,1639 ,1640 ,1644 ,1646 ,1655 ,1674 ,1682,
            1684 ,1686 ,1687 ,1694 ,1701 ,1705 ,1706 ,1716 ,1718 ,1729,
            1736 ,1737 ,1738 ,1744 ,1769 ,1770 ,1774 ,1794 ,1803 ,1804,
            1813 ,1829 ,1831 ,1832 ,1839 ,1840 ,1841 ,1844 ,1848 ,1850,
            1851 ,1853 ,1860 ,1866 ,1884 ,1886 ,1894 ,1895 ,1897 ,1898,
            1901 ,1908 ,1912 ,1928 ,1929 ,1932 ,1938 ,1954 ,1957 ,1958,
            1960 ,1962 ,1968 ,1976 ,1977 ,1978 ,1993 ,1996 ,1997 ,2000
        };
         //Questão1 A
         LocalDate dataAtual = LocalDate.now();
         int pro = 1860;
         int indice = buscaBinaria(arr, 1860);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra B
         int pro2 = 1440;
         int indice1 = buscaBinaria(arr, 1440);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra c
         int pro3 = 1521;
         int indice2 = buscaBinaria(arr, 1521);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra d
         int pro4 = 1040;
         int indice3 = buscaBinaria(arr, 1040);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra e
         int pro5 = 1225;
         int indice4 = buscaBinaria(arr, 1225);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra f
         int pro6 = 1370;
         int indice5 = buscaBinaria(arr, 1370);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra g
         int pro7 = 1579;
         int indice6 = buscaBinaria(arr, 1579);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra h
         int pro8 = 1901;
         int indice7 = buscaBinaria(arr, 1901);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra i
         int pro9 = 1515;
         int indice8 = buscaBinaria(arr, 1515);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra j
         int pro10 = 1770;
         int indice9 = buscaBinaria(arr, 1770);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra k
         int pro11 = 1620;
         int indice10 = buscaBinaria(arr, 1620);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra l
         int pro12 = 1095;
         int indice11 = buscaBinaria(arr, 1095);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via");
         //letra m
         int pro13 = 1263;
         int indice12 = buscaBinaria(arr, 1263);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via"); 
         //letra n
         int pro14 = 1105;
         int indice13 = buscaBinaria(arr, 1105);
         System.out.println("Registro: " +dataAtual   + "\n\nCarro/Placa: " + pro + ", Foi o " +indice +1+"º carro que trafegou na via"); 
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
