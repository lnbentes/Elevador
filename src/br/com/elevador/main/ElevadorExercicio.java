/*
3. Crie uma classe denominada ElevadorExercicio para armazenar as informações de um elevador dentro de um prédio.
A classe deve armazenar o andar atual (térreo= 0), total de andares no prédio, excluindo o térreo, capacidade do elevador,
e quantas pessoas estão presentes nele.
A classe deve também disponibilizar os seguintes métodos:

Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio
(os elevadores sempre começam no térreo e vazio);

Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);

Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);

Sobe: para subir um andar (não deve subir se já estiver no último andar);

Desce: para descer um andar (não deve descer se já estiver no térreo);

Encapsular todos os atributos da classe (criar os métodos set e get).
 */

package br.com.elevador.main;

public class ElevadorExercicio {

    private int andarMaximo;
    private int andarAtual;
    private int capacidadeTotal;
    private int numeroDePessoas;

    public ElevadorExercicio(int andares, int capacidadeTotal){
        this.andarMaximo = andares;
        this.capacidadeTotal = capacidadeTotal;
        this.andarAtual = 0;
        this.numeroDePessoas = 0;
    }

    public boolean entra(int numeroDeEntrada){
        if(numeroDeEntrada <= this.capacidadeTotal && this.numeroDePessoas <= this.capacidadeTotal && numeroDeEntrada > 0){
            this.numeroDePessoas += numeroDeEntrada;
            return true;
        } if(numeroDeEntrada >= this.capacidadeTotal && this.numeroDePessoas <= this.capacidadeTotal && numeroDeEntrada > 0){
            if(this.numeroDePessoas == this.capacidadeTotal){
                return false;
            }
            this.numeroDePessoas = this.capacidadeTotal;
            return true;
        }
        return false;
    }

    public boolean saida(int numeroDeSaida){
        if(numeroDeSaida <= this.numeroDePessoas && this.numeroDePessoas != 0 && numeroDeSaida >= 0){
            this.numeroDePessoas -= numeroDeSaida;
            return true;
        } if(numeroDeSaida >= this.numeroDePessoas && this.numeroDePessoas != 0 && numeroDeSaida >= 0){
            this.numeroDePessoas = 0;
            return true;
        }
        return false;
    }

    public boolean sobe(int numeroDoAndar){
        if(numeroDoAndar == this.andarAtual){
            return false;
        } if(numeroDoAndar <= this.andarMaximo && numeroDoAndar >= 0){
            subindo(numeroDoAndar);
            this.andarAtual = numeroDoAndar;
            return true;
        }
        return false;
    }

    private void subindo(int numeroDoAndar){
        for(int i = this.andarAtual; i <= numeroDoAndar; i++){
            if(i < numeroDoAndar){
                System.out.println("Andar: " + i);
            } if(i == numeroDoAndar){
                System.out.println("Chegou no andar: " + i);
            }
        }
    }

    public boolean desce(int numeroDoAndar){
        if(numeroDoAndar == this.andarAtual){
            return false;
        } if(numeroDoAndar <= this.andarAtual && numeroDoAndar >= 0){
            descendo(numeroDoAndar);
            this.andarAtual = numeroDoAndar;
            return true;
        }
        return false;
    }

    private void descendo(int numeroDoAndar){
        for(int i = this.andarAtual; i >= numeroDoAndar; i--){
            if(i > numeroDoAndar){
                System.out.println("Andar: " + i);
            } if(i == numeroDoAndar){
                System.out.println("Chegou no andar: " + i);
            }
        }
    }

    public int getAndarMaximo() {
        return andarMaximo;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public void setAndarMaximo(int andarMaximo) {
        this.andarMaximo = andarMaximo;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

}
