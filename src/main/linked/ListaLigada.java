package linked;

import javax.swing.text.html.parser.Element;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;
    

    public ListaLigada() {
        cabeca = null;

    }

    @Override
    public boolean buscaElemento(int valor) {
        No element = cabeca;

        if (element == null){
            return false;

        }else if (element.getValor() == valor) {
            return true;

        } else {
            No aux = element;
            while (aux.getProximo() != null) {
                if (aux.getProximo().getValor() == valor) {
                    return true;
                } else {
                    aux = aux.getProximo();
                }
            }
            return false;      
    }
    }

    @Override
    public int buscaIndice(int valor) {
        No inicio = cabeca;
        if (inicio == null) {
            return -1; 
        } else {
            int contador = 0;
            No aux = inicio; 
    
            while (aux != null) {
                
                if (aux.getValor() == valor) {
                    return contador; 
                }
                aux = aux.getProximo(); 
                contador++; 
            }
    
            return -1; 
        }
    
    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElemento'");
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        if (cabeca == null){
            cabeca = new No(valor);
        }else {
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
    }

    @Override
    public void insereFim(int valor) {
        No Element = cabeca;
        if (Element == null) {
            Element = new No(valor); 
        } else {
            No novoNo = new No(valor); 
            No aux = Element; 
    
            while (aux.getProximo() != null) {
                
                aux = aux.getProximo(); 
            }
            aux.setProximo(novoNo);
        }
    }
    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
