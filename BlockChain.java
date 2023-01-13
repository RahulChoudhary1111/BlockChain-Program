import java.util.ArrayList;

public class BlockChain{
    public static void main(String[] args) {
        
        // a series of blocks in a chain
        ArrayList<Block> blockChain = new ArrayList<Block>();

        String [] initialValues = {"Rahul has ₹700","Aman has ₹500"};
        Block firstBlock = new Block(initialValues, 0);
        blockChain.add(firstBlock);
        System.out.println("First block is "+firstBlock.toString());
        System.out.println("The blockchain is "+blockChain.toString());
        //BlockHash=758163147

        //block two
        String [] rahulGivesItAway = {"Rahul gives Sanjay ₹60","Rahul gives Mohit ₹40","Rahul gives Bhaskar ₹20"};
        Block secondBlock = new Block(rahulGivesItAway, firstBlock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second block is "+secondBlock.toString());
        System.out.println("The blockchain is "+blockChain.toString());
        //BlockHash=-772392907

        //block three
        String [] rahulGetsSomeBack = {"Sanjay gives Rahul ₹50","Mohit gives Rahul ₹70"};
        Block thirdBlock = new Block(rahulGetsSomeBack , secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third block is "+thirdBlock.toString());
        System.out.println("The blockchain is "+blockChain.toString());
        //BlockHash=526283400
    }
}