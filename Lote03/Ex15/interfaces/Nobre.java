package Ex15.interfaces;

import Ex15.classes.Conselheiro;
import Ex15.classes.Soldado;

public interface Nobre {
    Conselheiro c = new Conselheiro();
    Soldado[] s = new Soldado[20];

    void governar();
}