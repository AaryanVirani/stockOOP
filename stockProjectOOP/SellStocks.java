package stockProjectOOP;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SellStocks extends javax.swing.JFrame {
    private MainInterface mf;

    /**
     * Creates new form SellStocks
     */
    public SellStocks(MainInterface mf) {
        this.mf = mf;
        initComponents();

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

        this.addComponentListener(new ComponentAdapter() {
            public void componentMoved(ComponentEvent e) {
                setLocation(x, y);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        this.setResizable(false);

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stockInfo = new javax.swing.JTable();
        currBudgetlbl = new javax.swing.JLabel();
        currBudgetField = new javax.swing.JTextField();
        sellBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1 = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                // need to make image fit screen and make it dimmer
                super.paintComponent(g);
                g.drawImage(new javax.swing.ImageIcon("long.png").getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
                g.setColor(new Color(0, 0, 0, 150));
                g.fillRect(0, 0, this.getWidth(), this.getHeight());
            }
        };

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        stockInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Stock Name", "Shares Owned", "Curr. Purchase Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        loadStockData();
        jScrollPane1.setViewportView(stockInfo);

        currBudgetlbl.setText("Current Budget: ");
        currBudgetField.setText(String.format("$%.2f", mf.user.getBudget()));

        currBudgetlbl.setOpaque(true);
        currBudgetlbl.setBackground(new Color(0, 0, 0, 123)); // Semi-transparent black background
        currBudgetlbl.setForeground(new Color(255, 255, 255)); // White text
        currBudgetlbl.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5)); // Padding around the text

        currBudgetField.setEditable(false);

        sellBtn.setText("Sell Stock");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(currBudgetlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(currBudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(currBudgetlbl)
                    .addComponent(currBudgetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>  

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                     
        mf.setVisible(true);
        this.setVisible(false);
    }    

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int row = stockInfo.getSelectedRow();
        if (row != -1){
            String stockName = (String) stockInfo.getValueAt(row, 0);
            int sharesOwned = (int) stockInfo.getValueAt(row, 1);
            SpinnerNumberModel model = new SpinnerNumberModel(1, 1, sharesOwned, 1);
            javax.swing.JSpinner spinner = new javax.swing.JSpinner(model);
            spinner.setPreferredSize(new Dimension(100, 30));

            int result = JOptionPane.showOptionDialog(
                this,
                new Object[]{"How many shares of " + stockName + " do you want to sell? If writing, numbers above the cap will default to last left value.", spinner},
                "Sell Shares",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null
            );

            if (result == JOptionPane.OK_OPTION){
                int sharesToSell = (int) spinner.getValue();
                boolean success = mf.user.sellShares(mf.user.findPortfolioItem(stockName).getStockReference(), sharesToSell);
                if (success){
                    JOptionPane.showMessageDialog(this, "Shares sold successfully!");
                    currBudgetField.setText(String.format("$%.2f", mf.user.getBudget()));
                    stockInfo.setValueAt(mf.user.findPortfolioItem(stockName).getSharesOwned(), row, 1);
                }
                else{
                    JOptionPane.showMessageDialog(this, "You do not own that many shares of " + stockName + ".", "Invalid Number of Shares", JOptionPane.WARNING_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Please select a stock to sell.", "No Selection", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void loadStockData(){
        for (PortfolioItem item : mf.user.getPortfolioItems()){
            String stockName = item.getStockName();
            int sharesOwned = item.getSharesOwned();
            double currPurchasePrice = item.getPurchasePrice();
            currPurchasePrice = Math.round(currPurchasePrice * 100.0) / 100.0;
            Object[] data = {stockName, sharesOwned, currPurchasePrice};
            ((javax.swing.table.DefaultTableModel)stockInfo.getModel()).addRow(data);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sellBtn;
    private javax.swing.JTextField currBudgetField;
    private javax.swing.JLabel currBudgetlbl;
    private javax.swing.JTable stockInfo;
    // End of variables declaration                   
}
