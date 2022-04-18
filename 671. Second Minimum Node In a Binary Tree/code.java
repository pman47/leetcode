class Solution {
    public int findSecondMinimumValue(TreeNode root) {
         HashSet<Integer> list=new HashSet<>();
          che(root,list);
           List<Integer> list2 = new ArrayList<>(list);
        Collections.sort(list2);

          if(list.size()<2){return -1;}
        return list2.get(1);
    }
    static void che(TreeNode root,HashSet list){
        if(root==null){return;}
        che(root.left,list);
        list.add(root.val);
        che(root.right,list);
        list.add(root.val);
    }
}