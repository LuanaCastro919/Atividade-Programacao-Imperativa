public class Prova2025 {

    // QUESTÃO A
    public static int uniao(int[] a, int tamA,
                            int[] b, int tamB, int[] u) {

        int tamU = 0;

        for (int i = 0; i < tamA; i++) {
            boolean repetido = false;

            for (int j = 0; j < tamU; j++) {
                if (a[i] == u[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                u[tamU] = a[i];
                tamU++;
            }
        }

        for (int i = 0; i < tamB; i++) {
            boolean repetido = false;

            for (int j = 0; j < tamU; j++) {
                if (b[i] == u[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                u[tamU] = b[i];
                tamU++;
            }
        }

        return tamU;
    }


    // QUESTÃO B
    public static void ordenar(int[] v, int n) {

        for (int i = 1; i < n; i++) {

            int atual = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > atual) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = atual;
        }
    }


    // QUESTÃO C
    public static int gerarVetorSemRepeticao(
            int[] v, int tamV, int[] vsr) {

        int tamVSR = 0;

        for (int i = 0; i < tamV; i++) {

            boolean repetido = false;

            for (int j = 0; j < tamVSR; j++) {
                if (v[i] == vsr[j]) {
                    repetido = true;
                }
            }

            if (!repetido) {
                vsr[tamVSR] = v[i];
                tamVSR++;
            }
        }

        return tamVSR;
    }


    // QUESTÃO D
    public static void rotacionar(int[] v, int tam, int k) {

        if (tam <= 1) {
            return;
        }

        k = k % tam;

        if (k < 0) {
            k = k + tam;
        }

        for (int j = 0; j < k; j++) {

            int primeiro = v[0];

            for (int i = 0; i < tam - 1; i++) {
                v[i] = v[i + 1];
            }

            v[tam - 1] = primeiro;
        }
    }
}