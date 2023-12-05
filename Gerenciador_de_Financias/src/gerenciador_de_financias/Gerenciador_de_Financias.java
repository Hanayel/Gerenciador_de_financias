
package gerenciador_de_financias;

import java.util.Scanner;

public class Gerenciador_de_Financias {
    // Entrada de dados de receitas e despesas.
    public static void main(String[] args) {
              
        Receitas r = new Receitas ();
        Despesas d = new Despesas ();
        int valorLeitor;
        int valorLeitor2;
        float SaldoTotal = 0;
        
        Scanner leitor = new Scanner(System.in);
        char continuar = 'c';
        char repetirAcao = 's';
        char arquivoCriar = 'x';
            
        while (continuar == 'c' || continuar == 'C'){
   
            System.out.println("Digite que tipo de valor de receita vc gostaria de adicionar: \n1- Salario. \n2- Venda unica. \n3- Bonus. \n4- Valores aleatorios.");
            valorLeitor = leitor.nextInt();
            
            if(valorLeitor == 0){
             System.out.println("item invalido!");
             }
            if(valorLeitor == 1){
            System.out.println("Qual valor do Salario voce quer adicionar?");
            r.setSalario(leitor.nextFloat());
            }
            
            if(valorLeitor == 2){
            System.out.println("Qual valor da Venda unica voce quer adicionar?");
            r.setVendaUnic(leitor.nextFloat());
            }
            
            if(valorLeitor == 3){
            System.out.println("Qual valor do Bonus voce quer adicionar?");
            r.setBonus(leitor.nextFloat());
            }
            
            if(valorLeitor == 4){
            System.out.println("Qual valor de Valores aleatorios voce quer adicionar?");
            r.setValoresAleatorios(leitor.nextFloat());
            }
            if(valorLeitor >=5){
             System.out.println("item invalido!");
             }
             System.out.println("Deseja continuar mais cadastros de receita? C - Continuar / F - Finalizar.");
            continuar = leitor.next().charAt(0);
            }
          while(repetirAcao == 's' || repetirAcao == 'S'){
              
           System.out.println("Digite o tipo de despesas voce gostaria de adiciorar: \n1- Total de contas domesticas a se pagar. \n2- Imprevistos. \n3- Gastos com alimentacao. \n4- Gastos pessoais variados.");
             valorLeitor2 = leitor.nextInt();
                if(valorLeitor2 == 0){
                System.out.println("item invalido!");
                }
                    if(valorLeitor2 == 1){
                        System.out.println("Digite o valor Total de contas domesticas pendentes:");
                        d.setContasTotal(leitor.nextFloat());
                    }
                    
                    if(valorLeitor2 == 2){
                        System.out.println("Qual o valor dos gastos imprevistos?");
                        d.setImprevistos(leitor.nextFloat());
                    }
                    
                    if(valorLeitor2 == 3){
                        System.out.println("Qual o valor em gastos com alimentacao?");
                        d.setAlimentacao(leitor.nextFloat());
                    }
                    if(valorLeitor2 == 4){
                        System.out.println("Qual o valor que gastos pessoais variados?");
                        d.setGastosPessoais(leitor.nextFloat());
                    }
                    if(valorLeitor2 >= 5){
                     System.out.println("item invalido!");
                     }
             
             System.out.println("Deseja realizar mais cadastros de despesas? S - Sim / N - Nao.");
        repetirAcao = leitor.next().charAt(0);
        }
           
           while (arquivoCriar == 'x'||arquivoCriar == 'X' ){    
               
        SaldoTotal = r.getTotalReceitas() - d.getTotalDespesas(); 
       
         
        
       System.out.println("===Relatorio finaceiro=== \nValores positivos:" + r.getTotalReceitas() + "\nValores negativos:"  + d.getTotalDespesas() + "\nSaldo:" + SaldoTotal);
       
        
       
        System.out.println("Deseja imprimir o arquivo com detalhes? X - Sim / 0 - Nao.");
        arquivoCriar = leitor.next().charAt(0);
        
             Arquivo.recebeInfo("Finacias.txt", ("Receitas valores:\nSalario:" + r.getSalario() + "\nVenda unica:" + r.getVendaUnic() + "\nBonus:" + r.getBonus() +  "\nValores aleatorios:" + r.getValoresAleatorios() + "\nValor total em Receitas:" + r.getTotalReceitas()+ "\n\nDespesas valores:\nTotal de contas domesticas a se pagar:" +d.getContasTotal()+ "\nImprevistos:" + d.getImprevistos() + "\nGastos com alimentacao:" + d.getAlimentacao()+ "\nGastos pessoais variados:" + d.getGastosPessoais()+ "\nValor total em despesas:" + d.getTotalDespesas()+ "\n\n\n===Relatorio dos dados=== \nValores positivos:" + r.getTotalReceitas() + "\nValores negativos:"  + d.getTotalDespesas() + "\nSaldo:" + SaldoTotal));
             break;
             
          }
    
        }
    }        


    



