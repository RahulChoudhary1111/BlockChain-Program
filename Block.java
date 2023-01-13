import java.util.Arrays;

public class Block {
    private String[] transactions;
    private int blockHash;
    private int previosblockHash;
    
    public String toString(){
        return "Block[transactions=" + Arrays.toString(transactions) + ", BlockHash=" + blockHash + ", PreviousBlockHash=" + previosblockHash + "]";
    }
    
    public Block(String[] transactions , int previosblockHash){
        super();
        this.transactions=transactions;
        this.previosblockHash=previosblockHash;
        this.blockHash = Arrays.hashCode(new int[]{Arrays.hashCode(transactions),this.previosblockHash});
    }

    public String[] getTransactions(){
        return transactions;
    }

    public void setTransactions(String[] transactions){
        this.transactions=transactions;
    }

    public int getBlockHash(){
        return blockHash;
    }

    public void setBlockHash(int blockHash){
        this.blockHash=blockHash;
    }

    public int getPreviosblockHash(){
        return previosblockHash;
    }

    public void setPreviousblockHash(int previosblockHash){
        this.previosblockHash=previosblockHash;
    }
}
