import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class CalJanela extends javax.swing.JFrame {
       
    public CalJanela() {
        initComponents(); 
        URL url = this.getClass().getResource("calc.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);     
    }  
 
    //VARIAVEIS PARA CALCULOS
    Double valor1, valor2;
    String sinal;
    private static int fatorialR(valor1) {
    if (valor1 == 0)
        return 1;
    else return (valor1*fatorialR(valor1-1);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        txtResultado = new javax.swing.JTextField();
        btnLimparAtual = new javax.swing.JButton();
        bntLimpaTudo = new javax.swing.JButton();
        bntDivisao = new javax.swing.JButton();
        bntVezes = new javax.swing.JButton();
        bntNove = new javax.swing.JButton();
        bntOito = new javax.swing.JButton();
        bntSete = new javax.swing.JButton();
        bntCinco = new javax.swing.JButton();
        bntSeis = new javax.swing.JButton();
        bntQuatro = new javax.swing.JButton();
        bntMenos = new javax.swing.JButton();
        bntUm = new javax.swing.JButton();
        bntMais = new javax.swing.JButton();
        bntTres = new javax.swing.JButton();
        bntDois = new javax.swing.JButton();
        bntZero = new javax.swing.JButton();
        bntResultado = new javax.swing.JButton();
        bntVirgula = new javax.swing.JButton();
        bntFatorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtResultado.setPreferredSize(new java.awt.Dimension(100, 100));

        btnLimparAtual.setText("CE");
        btnLimparAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparAtualActionPerformed(evt);
            }
        });

        bntLimpaTudo.setText("C");
        bntLimpaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntLimpaTudoActionPerformed(evt);
            }
        });

        bntDivisao.setText("*");
        bntDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDivisaoActionPerformed(evt);
            }
        });

        bntVezes.setText("/");
        bntVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVezesActionPerformed(evt);
            }
        });

        bntNove.setText("9");
        bntNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNoveActionPerformed(evt);
            }
        });

        bntOito.setText("8");
        bntOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntOitoActionPerformed(evt);
            }
        });

        bntSete.setText("7");
        bntSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSeteActionPerformed(evt);
            }
        });

        bntCinco.setText("5");
        bntCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCincoActionPerformed(evt);
            }
        });

        bntSeis.setText("6");
        bntSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSeisActionPerformed(evt);
            }
        });

        bntQuatro.setText("4");
        bntQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntQuatroActionPerformed(evt);
            }
        });

        bntMenos.setText("-");
        bntMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMenosActionPerformed(evt);
            }
        });

        bntUm.setText("1");
        bntUm.setMaximumSize(new java.awt.Dimension(80, 80));
        bntUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUmActionPerformed(evt);
            }
        });

        bntMais.setText("+");
        bntMais.setMaximumSize(new java.awt.Dimension(37, 23));
        bntMais.setMinimumSize(new java.awt.Dimension(37, 23));
        bntMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMaisActionPerformed(evt);
            }
        });

        bntTres.setText("3");
        bntTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntTresActionPerformed(evt);
            }
        });

        bntDois.setText("2");
        bntDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDoisActionPerformed(evt);
            }
        });

        bntZero.setText("0");
        bntZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntZeroActionPerformed(evt);
            }
        });

        bntResultado.setText("=");
        bntResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntResultadoActionPerformed(evt);
            }
        });

        bntVirgula.setText(",");

        bntFatorial.setText("Fatorial");
        bntFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFatorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FundoLayout = new javax.swing.GroupLayout(Fundo);
        Fundo.setLayout(FundoLayout);
        FundoLayout.setHorizontalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bntMenos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntDivisao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntVezes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addComponent(txtResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addComponent(bntLimpaTudo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimparAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(FundoLayout.createSequentialGroup()
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FundoLayout.createSequentialGroup()
                                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bntSete)
                                            .addComponent(bntQuatro)
                                            .addComponent(bntUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(bntCinco)
                                            .addComponent(bntDois)
                                            .addComponent(bntOito)))
                                    .addGroup(FundoLayout.createSequentialGroup()
                                        .addComponent(bntZero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bntVirgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntSeis, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(bntTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntNove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(14, 14, 14)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntFatorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        FundoLayout.setVerticalGroup(
            FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntVezes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimparAtual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(bntLimpaTudo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntFatorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FundoLayout.createSequentialGroup()
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(bntNove)
                            .addComponent(bntOito)
                            .addComponent(bntSete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(bntSeis)
                            .addComponent(bntCinco)
                            .addComponent(bntQuatro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(bntTres)
                            .addComponent(bntDois)
                            .addComponent(bntUm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntVirgula)
                            .addComponent(bntZero)))
                    .addComponent(bntResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    //ONDE A MAGICA ACONTECE
    private void bntUmActionPerformed(java.awt.event.ActionEvent evt) {                                      
  
        txtResultado.setText(txtResultado.getText()+"1");
    }                                     

    private void bntResultadoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        valor2 = Double.parseDouble(txtResultado.getText());
        if (sinal == "soma") {
            txtResultado.setText(String.valueOf(valor1+valor2));
            
        } else if (sinal == "menos") {
            txtResultado.setText(String.valueOf(valor1-valor2));
        } else if (sinal == "divisao") {
            txtResultado.setText(String.valueOf(valor1/valor2));
        } else if (sinal == "multi") {
            txtResultado.setText(String.valueOf(valor1*valor2));
        }
    }                                            

    private void bntZeroActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"0");
    }                                       

    private void bntTresActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"3");
    }                                       

    private void bntDoisActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"2");
    }                                       

    private void bntQuatroActionPerformed(java.awt.event.ActionEvent evt) {                                          

        txtResultado.setText(txtResultado.getText()+"4");
    }                                         

    private void bntCincoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"5");
    }                                        

    private void bntSeisActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"6");
    }                                       

    private void bntSeteActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"7");
    }                                       

    private void bntOitoActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"8");
    }                                       

    private void bntNoveActionPerformed(java.awt.event.ActionEvent evt) {                                        

        txtResultado.setText(txtResultado.getText()+"9");
    }                                       

    private void btnLimparAtualActionPerformed(java.awt.event.ActionEvent evt) {                                               
        txtResultado.setText("");
    }                                              

    private void bntMaisActionPerformed(java.awt.event.ActionEvent evt) {                                        

        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "soma";
    }                                       

    private void bntMenosActionPerformed(java.awt.event.ActionEvent evt) {                                         

        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "menos";
    }                                        

    private void bntVezesActionPerformed(java.awt.event.ActionEvent evt) {                                         

        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "divisao";
    }                                        

    private void bntDivisaoActionPerformed(java.awt.event.ActionEvent evt) {                                           

        valor1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "multi";
    }                                          

    private void bntLimpaTudoActionPerformed(java.awt.event.ActionEvent evt) {                                             

        valor1 = null;
        valor2 = null;
        txtResultado.setText("");
        
    }                                            

    private void bntFatorialActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        fatorialR;
    }                                           


    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalJanela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalJanela().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Fundo;
    private javax.swing.JButton bntCinco;
    private javax.swing.JButton bntDivisao;
    private javax.swing.JButton bntDois;
    private javax.swing.JButton bntFatorial;
    private javax.swing.JButton bntLimpaTudo;
    private javax.swing.JButton bntMais;
    private javax.swing.JButton bntMenos;
    private javax.swing.JButton bntNove;
    private javax.swing.JButton bntOito;
    private javax.swing.JButton bntQuatro;
    private javax.swing.JButton bntResultado;
    private javax.swing.JButton bntSeis;
    private javax.swing.JButton bntSete;
    private javax.swing.JButton bntTres;
    private javax.swing.JButton bntUm;
    private javax.swing.JButton bntVezes;
    private javax.swing.JButton bntVirgula;
    private javax.swing.JButton bntZero;
    private javax.swing.JButton btnLimparAtual;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration                   
}
