package com.mkleo.S9组合模式;

/**
 * @说明: 节点
 * @作者: Wang HengJin
 * @日期: 2018/5/14 9:19 星期一
 */
public class Node {

    private final int nodeId;         //节点ID
    private final String nodeName;    //节点名称
    private final Node parentNode;    //父节点
    private final int nodeLevel;      //节点等级

    public Node(int nodeId, String nodeName, Node parentNode) {
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.parentNode = parentNode;

        if (isRoot()) { //如果是根节点
            nodeLevel = 1;
        } else {
            nodeLevel = parentNode.getNodeLevel() + 1;
        }
    }

    public int getNodeId() {
        return nodeId;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public String getNodeName() {
        return nodeName;
    }

    //是否是根节点
    public boolean isRoot() {
        return parentNode == null;
    }

    public int getNodeLevel() {
        return nodeLevel;
    }

    @Override
    public String toString() {
        return "NodeName:" + nodeName +
                "  NodeLevel:" + nodeLevel +
                "  ParentNodeName:" + (parentNode == null ? "" : parentNode.getNodeName());
    }
}
