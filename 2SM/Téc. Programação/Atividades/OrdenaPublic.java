class OrdenaPublic {
    public void crescente(int n1, int n2, int n3) {
        int[] lista = {n1, n2, n3};
        for(int a=0; a < lista.length;a++) {
           for(int b=0; b < lista.length -1;b++) {
               if(lista[b] > lista[b+1]) {
                   int aux = lista[b];
                   lista[b] = lista[b+1];
                   lista[b+1] = aux;
               }
           }
        }
        for(int c=0; c < lista.length;c++) {
           System.out.println(lista[c]);
        }
    }
}