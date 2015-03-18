package cellwars_frontend;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author Abrie van Aardt 13178840
 * @author Michelle Swanepoel 13066294
 */
public class CellWarsUI extends javax.swing.JFrame {

    /**
     * Creates new form CellWarsUI
     */    
    public CellWarsUI(int _dimensions, int _totCellCount, int _gameMode) {
        initComponents();
        GAME_MODE = _dimensions;
        DIMENSIONS = _totCellCount;
        TOT_CELL_COUNT = _gameMode;
        cells = new CellComponent[DIMENSIONS][DIMENSIONS];
        this.setSize(getInsets().left + getInsets().right + CELL_WIDTH*DIMENSIONS,
             getInsets().top + getInsets().bottom + CELL_HEIGHT*DIMENSIONS);
        setLocationRelativeTo(null);               
    }
    
    public void initiliaseUI(Board board){
        for (int i=0; i < DIMENSIONS; ++i){
            for (int j=0; j < DIMENSIONS; ++j){
                cells[i][j] = new CellComponent();
                cells[i][j].setBackground(Color.WHITE);
                cells[i][j].setLocation(i*CELL_WIDTH, j*CELL_HEIGHT);
                cells[i][j].setSize(CELL_WIDTH, CELL_HEIGHT);
                cells[i][j].setVisible(true);                
                this.getContentPane().add(cells[i][j]);
            }
        }
        
        this.addMouseListener(new MouseListener(){

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        int xIndex = (e.getX()- getInsets().left)/CELL_WIDTH;
                        int yIndex = (e.getY()- getInsets().top)/CELL_HEIGHT;
                        
                        board.acceptCoordinate(new Coordinate(xIndex, yIndex));
                        
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {                 
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        
                    }
                    
                    public void actionPerformed(MouseEvent e){
                       
                    }
                });
       
    }
    
    private void updateUI(Board board){
        
    }   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1219, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private final int GAME_MODE;
    private final int DIMENSIONS;
    private final int TOT_CELL_COUNT;
    private final int CELL_HEIGHT = 100;
    private final int CELL_WIDTH = 200;
    private CellComponent[][] cells;
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}