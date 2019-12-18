package Leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L5114 {

    HashMap<Integer, XTreeNode> intToNode = new HashMap<>();

    public static void main(String[] args) {
        L5114 l5114 = new L5114();

        int nodes = 7;
        int[] parent = new int[]{-1,0,0,1,2,2,2};
        int[] value = new int[]{1,-2,4,0,-2,-1,-1};

        System.out.println(l5114.deleteTreeNodes(nodes, parent, value));
    }

    public int deleteTreeNodes(int nodes, int[] parent, int[] value) {
        XTreeNode node0 = new XTreeNode();

        for (int i=0; i<parent.length;i++) {
            XTreeNode node = new XTreeNode();
            if (parent[i] == -1) {
                node.index = 0;
                node.setParent(intToNode.get(parent[i]));
                node.setValue(value[i]);

                node0 = node;
            } else {
                node.index = i;
                node.setParent(intToNode.get(parent[i]));
                node.setValue(value[i]);
            }
            intToNode.put(i, node);
        }
        return node0.getNumberOfNonNUllChilds();
    }
}

class XTreeNode {

    public int index;
    public int value;
    public XTreeNode parent;
    public List<XTreeNode> childs = new ArrayList<>();
    public int allSum;

    public void setParent(XTreeNode parent) {
        if (parent == null) return;
        this.parent = parent;
        this.parent.addChild(this);
    }

    public void addChild(XTreeNode node) {
        if (node == null) return;
        this.childs.add(node);
    }

    public void setValue(int value) {
        this.value = value;
        this.allSum += value;
        if (parent != null) {
            parent.addChildValue(value);
        }
    }

    public void addChildValue(int value) {
        allSum +=value;
        if (parent != null) {
            parent.addChildValue(value);
        }
    }

    public int getNumberOfNonNUllChilds() {
        int xx = 0;
        if (allSum == 0) {
            return 0;
        } else {
            xx++;
            for (XTreeNode child : childs) {
                xx = xx + child.getNumberOfNonNUllChilds();
            }
        }

        return xx;
    }
}
