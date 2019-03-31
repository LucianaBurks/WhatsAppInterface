package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
     public static void main(String[] args) {
        Main main = new Main();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("WhatsApp Web");
        frame.setMinimumSize(new Dimension(1000, 700));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMain = new JPanel();
        panelMain.setLayout(new BorderLayout());
        
        JPanel panel1 = main.criaContatos(main);  
        JPanel panel2 = main.criaConversa(main);
        
        panelMain.add(panel1, BorderLayout.WEST);
        panelMain.add(panel2, BorderLayout.CENTER);

        frame.add(panelMain);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel criaContatos(Main main){       
        JPanel panelContatos = new JPanel();
        panelContatos.setLayout(new BorderLayout());
        panelContatos.add(main.criaContatoCabecalho(), BorderLayout.NORTH);
        panelContatos.add(main.criaContatoCentro(main), BorderLayout.CENTER);
        
        return panelContatos;
    }
    
    private JPanel criaConversa(Main main){        
        JButton jb3 = new JButton("CENTER");
        
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        panelConversa.add(main.criaConversaCabecalho(), BorderLayout.NORTH);
        panelConversa.add(main.criaConversaRodape(), BorderLayout.SOUTH);
        panelConversa.add(jb3, BorderLayout.CENTER);

        return panelConversa;
    }
    
    private JPanel criaContatoCentro(Main main){
        JPanel panelConversa = new JPanel();
        panelConversa.setLayout(new BorderLayout());
        
        panelConversa.add(main.criaContatoCentroPesquisa(), BorderLayout.NORTH);
        panelConversa.add(main.criaContatoCentroConversas(main), BorderLayout.CENTER);
        
        return panelConversa;
    }
    
    private JPanel criaContatoCentroPesquisa(){
        JPanel panelPesquisa = new JPanel();
        panelPesquisa.setLayout(new BorderLayout());
        
        JPanel panelLupa = new JPanel();
        panelLupa.setLayout(new BorderLayout());
        JLabel jlLupa = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//lupa.png")));
        jlLupa.setBorder(null);
        panelLupa.add(jlLupa);
        
        JPanel panelTexto = new JPanel();
        JTextField jtPesquisa = new JTextField("Pesquisa aqui");
        jtPesquisa.setPreferredSize(new Dimension(300, 25));
        panelTexto.add(jtPesquisa);
        
        panelPesquisa.add(panelLupa, BorderLayout.LINE_START);
        panelPesquisa.add(panelTexto, BorderLayout.CENTER);
        return panelPesquisa;
    }
    
    private JPanel criaContatoCentroConversas(Main main){
        JPanel panelListaConversas = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelListaConversas, BoxLayout.Y_AXIS);
        panelListaConversas.setLayout(boxLayout);
        
        //Conversa 1
        JPanel panelConversa1 = main.criaContatoConversa("João Gabriel", "Já chegou na facul? ", "22:26");
        panelListaConversas.add(panelConversa1);
        
        //Conversa 2
        JPanel panelConversa2 = main.criaContatoConversa("Netflix", "Novos episódios de Star Trek!", "10:26");
        panelListaConversas.add(panelConversa2);
        
        //Conversa 3
        JPanel panelConversa3 = main.criaContatoConversa("Maria Eduarda S2", "Dai", "23:00");
        panelListaConversas.add(panelConversa3);
        
        //Conversa 4
        JPanel panelConversa4 = main.criaContatoConversa("Rosa", "Você fez o trabalho do professor Flávio?", "02:26");
        panelListaConversas.add(panelConversa4);
        
        //Conversa 5
        JPanel panelConversa5 = main.criaContatoConversa("Luisa", "Vai fazer o que no fim de semana, estava pensando em... ", "10:06");
        panelListaConversas.add(panelConversa5);
        
        //Conversa 6
        JPanel panelConversa6 = main.criaContatoConversa("Rolê de Finds", "48 65419999 saiu", "05:55");
        panelListaConversas.add(panelConversa6);
        
        return panelListaConversas;
    }
    
    private JPanel criaContatoConversa(String nome, String descricao, String horario){
        JPanel panelConversa = new JPanel();
        panelConversa.setPreferredSize(new Dimension(350, 50));
        panelConversa.setLayout(new BorderLayout());
        
        JPanel panelConversa1 = new JPanel();
        panelConversa1.setBackground(Color.WHITE);
        JLabel jlLogo = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//fotoPadrao.png")));
        jlLogo.setSize(50, 50);
        jlLogo.setBorder(null);
        panelConversa1.add(jlLogo);
        
        JPanel panelConversa2 = new JPanel();
        panelConversa2.setBackground(Color.WHITE);
        BoxLayout boxLayout = new BoxLayout(panelConversa2, BoxLayout.Y_AXIS);
        panelConversa2.setLayout(boxLayout);
        JLabel jlNomeConversa = new JLabel("<html><p style='padding-top: 10px; font-family: \"verdana\";font-size: 11px;'>"+nome+"<p></html>");
        JLabel jlDescricaoConversa = new JLabel(descricao);
        panelConversa2.add(jlNomeConversa);
        panelConversa2.add(jlDescricaoConversa);
        
        JPanel panelConversa3 = new JPanel();
        panelConversa3.setBackground(Color.WHITE);
        JLabel jlHorario = new JLabel(horario);
        panelConversa3.add(jlHorario);
        
        panelConversa.add(panelConversa1, BorderLayout.LINE_START);
        panelConversa.add(panelConversa2, BorderLayout.CENTER);
        panelConversa.add(panelConversa3, BorderLayout.LINE_END);
        return panelConversa;
    }
    
    private JPanel criaContatoCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlFoto = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//fotoPadraoMini.png")));
        jlFoto.setBorder(null);
        panelCabecalho1.add(jlFoto);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMenu = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//menu.png")));
        jlMenu.setBorder(null);
        JLabel jlStatus = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//status.png")));
        jlStatus.setBorder(null);
        JLabel jlNovaConversa = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//novaConversa.png")));
        jlNovaConversa.setBorder(null);
        panelCabecalho3.add(jlStatus);
        panelCabecalho3.add(jlNovaConversa);
        panelCabecalho3.add(jlMenu);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaCabecalho(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlFoto = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//fotoConversa1Mini.png")));
        jlFoto.setBorder(null);
        panelCabecalho1.add(jlFoto);
        
        JPanel panelCabecalho2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho2, BoxLayout.Y_AXIS);
        panelCabecalho2.setLayout(boxLayout);
        JLabel jbNomeConversa = new JLabel("<html><p style='padding-top: 7px; font-family: \"verdana\";font-size: 11px;'>João Gabriel<p></html>");
        JLabel jbDescricaoConversa = new JLabel("<html><p style='font-family: \"verdana\";font-size: 8px;'>Visto por último em 25/03/2019 ás 19:41hs<p></html>");
        panelCabecalho2.add(jbNomeConversa);
        panelCabecalho2.add(jbDescricaoConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMenu = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//menu.png")));
        jlMenu.setBorder(null);
        JLabel jlAnexo = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//anexo.png")));
        jlAnexo.setBorder(null);
        JLabel jlLupa = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//lupa.png")));
        jlLupa.setBorder(null);
        panelCabecalho3.add(jlLupa);
        panelCabecalho3.add(jlAnexo);
        panelCabecalho3.add(jlMenu);

        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
    
    private JPanel criaConversaRodape(){
        JPanel panelCabecalho = new JPanel();
        panelCabecalho.setLayout(new BorderLayout());
        
        JPanel panelCabecalho1 = new JPanel();
        JLabel jlEmoticon = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//emoticons.png")));
        jlEmoticon.setBorder(null);
        panelCabecalho1.add(jlEmoticon);
        
        JPanel panelCabecalho2 = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panelCabecalho2, BoxLayout.Y_AXIS);
        panelCabecalho2.setLayout(boxLayout);
        JTextField jbNomeConversa = new JTextField("Olá professor!");
        panelCabecalho2.add(jbNomeConversa);
        
        JPanel panelCabecalho3 = new JPanel();
        JLabel jlMicrofone = new JLabel(new javax.swing.ImageIcon(getClass().getResource("icones//microfone.png")));
        jlMicrofone.setBorder(null);
        panelCabecalho3.add(jlMicrofone);
        
        panelCabecalho.add(panelCabecalho1, BorderLayout.LINE_START);
        panelCabecalho.add(panelCabecalho2, BorderLayout.CENTER);
        panelCabecalho.add(panelCabecalho3, BorderLayout.LINE_END);
        
        return panelCabecalho;
    }
}
