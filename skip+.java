// C:\Users\joshu\Repositories\VAuD_Project\skip+
import java.util.AbstractMap.SimpleEntry;
import simulator.NodeGenerator;
import simulator.Node;
import launcher.InternalLauncher;
import java.util.Map.Entry;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Startup implements NodeGenerator{
public static void main(String[] args){
InternalLauncher.launch(new Startup(),args[0], Integer.parseInt(args[1]), args[2].equals("on"), args[3].equals("on"), args[4].equals("on"), args[5], Integer.parseInt(args[6]), Integer.parseInt(args[7]));}
public String[] nodeTypes(){
return new String[]{"succPredListclientNode"};
}
public Node generateNode(String type, String name, boolean runSemisynchron){
if (type.equals("succPredListclientNode")) return new nodeTypesuccPredListclientNode(name, runSemisynchron);
return null;
}
}class nodeTypesuccPredListclientNode extends Node{
public nodeTypesuccPredListclientNode (String name, boolean runSemisynchron){super(name,"succPredListclientNode",runSemisynchron);}
int v1 = 5;
String v2 = "";
boolean v3 = this.FALSE;
HashMap<String, Edge> v4 = new HashMap<String, Edge>();
HashMap<String, Edge> v5 = new HashMap<String, Edge>();
HashMap<String, Edge> v6 = new HashMap<String, Edge>();
HashMap<Integer, String> v7 = new HashMap<Integer, String>();
List<Edge> v8 = new ArrayList<Edge>();
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("limit",v1), 
new SimpleEntry<String, Object>("bitString",v2), 
new SimpleEntry<String, Object>("deleted",v3), 
new SimpleEntry<String, Object>("succPredList",v4), 
new SimpleEntry<String, Object>("neighbors",v5), 
new SimpleEntry<String, Object>("toBeDeleted",v6), 
new SimpleEntry<String, Object>("broadcast_messages",v7), 
new SimpleEntry<String, Object>("tempArray",v8)};}
@SuppressWarnings("unchecked")
public Entry<String, Entry<String, String>[]>[] getFunctions(){
List<Entry<String, Entry<String, String>[]>> attr = new LinkedList<Entry<String, Entry<String, String>[]>>();
attr.add(new SimpleEntry<String, Entry<String, String>[]>("init",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("timeout",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("linearize",new SimpleEntry[] {
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("entry",new SimpleEntry[] {
new SimpleEntry<String, String>("C", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("search",new SimpleEntry[] {
new SimpleEntry<String, String>("searchedId", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forgetNode",new SimpleEntry[] {
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("broadcast",new SimpleEntry[] {
new SimpleEntry<String, String>("message", "String"), 
new SimpleEntry<String, String>("message_id", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("delete",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("integer",new SimpleEntry[] {
new SimpleEntry<String, String>("x", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("checkIfNodeOnLevel",new SimpleEntry[] {
new SimpleEntry<String, String>("currentLevel", "int"), 
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("bitfolge",new SimpleEntry[] {
new SimpleEntry<String, String>("x", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("minPred",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("globalMinPred",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("maxSucc",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("globalMaxSucc",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("longestCommonPrefix",new SimpleEntry[] {
new SimpleEntry<String, String>("bit1", "String"), 
new SimpleEntry<String, String>("bit2", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("getLongestCommonPrefixNode",new SimpleEntry[] {
new SimpleEntry<String, String>("bitString", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("CheckIfNodeInRange",new SimpleEntry[] {
new SimpleEntry<String, String>("currentLevel", "int"), 
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forwardNode",new SimpleEntry[] {
new SimpleEntry<String, String>("forwardedNode", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedLeftNeighbors",new SimpleEntry[] {
new SimpleEntry<String, String>("currentLevel", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedRightNeighbors",new SimpleEntry[] {
new SimpleEntry<String, String>("currentLevel", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("bubbleSort",new SimpleEntry[] {}));
Entry<String, Entry<String, String>[]>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
@SuppressWarnings("unchecked")
public Entry<String, Long>[] getFunctionCallCounter(){List<Entry<String, Long>> attr = new LinkedList<Entry<String, Long>>();
attr.add(new SimpleEntry<String, Long>("init",callCounterinit));
attr.add(new SimpleEntry<String, Long>("timeout",callCountertimeout));
attr.add(new SimpleEntry<String, Long>("linearize",callCounterlinearize));
attr.add(new SimpleEntry<String, Long>("entry",callCounterentry));
attr.add(new SimpleEntry<String, Long>("search",callCountersearch));
attr.add(new SimpleEntry<String, Long>("forgetNode",callCounterforgetNode));
attr.add(new SimpleEntry<String, Long>("broadcast",callCounterbroadcast));
attr.add(new SimpleEntry<String, Long>("delete",callCounterdelete));
attr.add(new SimpleEntry<String, Long>("integer",callCounterinteger));
attr.add(new SimpleEntry<String, Long>("checkIfNodeOnLevel",callCountercheckIfNodeOnLevel));
attr.add(new SimpleEntry<String, Long>("bitfolge",callCounterbitfolge));
attr.add(new SimpleEntry<String, Long>("minPred",callCounterminPred));
attr.add(new SimpleEntry<String, Long>("globalMinPred",callCounterglobalMinPred));
attr.add(new SimpleEntry<String, Long>("maxSucc",callCountermaxSucc));
attr.add(new SimpleEntry<String, Long>("globalMaxSucc",callCounterglobalMaxSucc));
attr.add(new SimpleEntry<String, Long>("longestCommonPrefix",callCounterlongestCommonPrefix));
attr.add(new SimpleEntry<String, Long>("getLongestCommonPrefixNode",callCountergetLongestCommonPrefixNode));
attr.add(new SimpleEntry<String, Long>("CheckIfNodeInRange",callCounterCheckIfNodeInRange));
attr.add(new SimpleEntry<String, Long>("forwardNode",callCounterforwardNode));
attr.add(new SimpleEntry<String, Long>("sortedLeftNeighbors",callCountersortedLeftNeighbors));
attr.add(new SimpleEntry<String, Long>("sortedRightNeighbors",callCountersortedRightNeighbors));
attr.add(new SimpleEntry<String, Long>("bubbleSort",callCounterbubbleSort));
Entry<String, Long>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
protected void messageReceived(Object [] params){
if (params.length<1 || ! (params[0] instanceof String)) return;
if (params[0].equals("init")){
funinit();if ((boolean)params[1]){
print("init returned");
}
}
if (params[0].equals("timeout")){
funtimeout();if ((boolean)params[1]){
print("timeout returned");
}
}
if (params[0].equals("linearize")){
funlinearize((simulator.Node)params[2]);if ((boolean)params[1]){
print("linearize returned");
}
}
if (params[0].equals("entry")){
funentry((simulator.Node)params[2]);if ((boolean)params[1]){
print("entry returned");
}
}
if (params[0].equals("search")){
funsearch((int)params[2]);if ((boolean)params[1]){
print("search returned");
}
}
if (params[0].equals("forgetNode")){
funforgetNode((simulator.Node)params[2]);if ((boolean)params[1]){
print("forgetNode returned");
}
}
if (params[0].equals("broadcast")){
funbroadcast((String)params[2], (int)params[3]);if ((boolean)params[1]){
print("broadcast returned");
}
}
if (params[0].equals("delete")){
fundelete();if ((boolean)params[1]){
print("delete returned");
}
}
if (params[0].equals("integer")){
Object result = funinteger((String)params[2]);
if ((boolean)params[1]){
print("integer returns " + result);
}
}
if (params[0].equals("checkIfNodeOnLevel")){
Object result = funcheckIfNodeOnLevel((int)params[2], (simulator.Node)params[3]);
if ((boolean)params[1]){
print("checkIfNodeOnLevel returns " + result);
}
}
if (params[0].equals("bitfolge")){
Object result = funbitfolge((int)params[2]);
if ((boolean)params[1]){
print("bitfolge returns " + result);
}
}
if (params[0].equals("minPred")){
Object result = funminPred((int)params[2]);
if ((boolean)params[1]){
print("minPred returns " + result);
}
}
if (params[0].equals("globalMinPred")){
Object result = funglobalMinPred();
if ((boolean)params[1]){
print("globalMinPred returns " + result);
}
}
if (params[0].equals("maxSucc")){
Object result = funmaxSucc((int)params[2]);
if ((boolean)params[1]){
print("maxSucc returns " + result);
}
}
if (params[0].equals("globalMaxSucc")){
Object result = funglobalMaxSucc();
if ((boolean)params[1]){
print("globalMaxSucc returns " + result);
}
}
if (params[0].equals("longestCommonPrefix")){
Object result = funlongestCommonPrefix((String)params[2], (String)params[3]);
if ((boolean)params[1]){
print("longestCommonPrefix returns " + result);
}
}
if (params[0].equals("getLongestCommonPrefixNode")){
Object result = fungetLongestCommonPrefixNode((String)params[2]);
if ((boolean)params[1]){
print("getLongestCommonPrefixNode returns " + result);
}
}
if (params[0].equals("CheckIfNodeInRange")){
Object result = funCheckIfNodeInRange((int)params[2], (simulator.Node)params[3]);
if ((boolean)params[1]){
print("CheckIfNodeInRange returns " + result);
}
}
if (params[0].equals("forwardNode")){
funforwardNode((simulator.Node)params[2]);if ((boolean)params[1]){
print("forwardNode returned");
}
}
if (params[0].equals("sortedLeftNeighbors")){
funsortedLeftNeighbors((int)params[2]);if ((boolean)params[1]){
print("sortedLeftNeighbors returned");
}
}
if (params[0].equals("sortedRightNeighbors")){
funsortedRightNeighbors((int)params[2]);if ((boolean)params[1]){
print("sortedRightNeighbors returned");
}
}
if (params[0].equals("bubbleSort")){
funbubbleSort();if ((boolean)params[1]){
print("bubbleSort returned");
}
}
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v2=funbitfolge(id(this));
int v9 = 0;
for(v9=0;(v9<v1);v9=v9+1){{
updateVisualization(v4,null,true,"black",0,(v9+"_succ0"));
updateVisualization(v4,null,true,"black",0,(v9+"_succ1"));
updateVisualization(v4,null,true,"black",0,(v9+"_pred0"));
updateVisualization(v4,null,true,"black",0,(v9+"_pred1"));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
List<simulator.Node> v10 = new ArrayList<simulator.Node>();
List<simulator.Node> v11 = new ArrayList<simulator.Node>();
clearArray(v8,true);
int v12 = 0;
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}for(v12=0;(v12<v1);v12=v12+1){{
funsortedLeftNeighbors(v12);int v13 = 0;
for(v13=(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1);(v13>1);v13=v13-1){{
{if ((getArrayIndex(v8,null,v13)!=null?((Edge)(getArrayIndex(v8,null,v13))).node:null)!=null) (getArrayIndex(v8,null,v13)!=null?((Edge)(getArrayIndex(v8,null,v13))).node:null).send("linearize",false,(getArrayIndex(v8,null,(v13-1))!=null?((Edge)(getArrayIndex(v8,null,(v13-1)))).node:null));}
if(((getArrayIndex(v8,null,(v13-1))!=null?((Edge)(getArrayIndex(v8,null,(v13-1)))).node:null)==null)){{
print(("tempArray[i-1] is null with i = "+v13));}
}}
}if(((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null)!=null) (getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v10,Arrays.asList(v12),(getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null),null,1);
clearArray(v8,true);
funsortedRightNeighbors(v12);int v14 = 0;
for(v14=0;(v14<(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1));v14=v14+1){{
{if ((getArrayIndex(v8,null,v14)!=null?((Edge)(getArrayIndex(v8,null,v14))).node:null)!=null) (getArrayIndex(v8,null,v14)!=null?((Edge)(getArrayIndex(v8,null,v14))).node:null).send("linearize",false,(getArrayIndex(v8,null,(v14+1))!=null?((Edge)(getArrayIndex(v8,null,(v14+1)))).node:null));}
if(((getArrayIndex(v8,null,(v14+1))!=null?((Edge)(getArrayIndex(v8,null,(v14+1)))).node:null)==null)){{
print(("tempArray[j+1] is null with j = "+v14));}
}}
}if(((getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1))!=null?((Edge)(getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1)))).node:null)!=null)){{
{if ((getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1))!=null?((Edge)(getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1)))).node:null)!=null) (getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1))!=null?((Edge)(getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1)))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v11,Arrays.asList(v12),(getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1))!=null?((Edge)(getArrayIndex(v8,null,(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1)))).node:null),null,1);
}
}for(v12=0;(v12<v1);v12=v12+1){{
clearArray(v8,true);
funsortedLeftNeighbors(v12);int v15 = 0;
for(v15=0;(v15<length((List<Node>)copyEdgeArrayToNodeArray(v8,1)));v15=v15+1){{
if((getArrayIndex(v11,null,v12)!=null)){{
{if ((getArrayIndex(v8,null,v15)!=null?((Edge)(getArrayIndex(v8,null,v15))).node:null)!=null) (getArrayIndex(v8,null,v15)!=null?((Edge)(getArrayIndex(v8,null,v15))).node:null).send("linearize",false,getArrayIndex(v11,null,v12));}
}
}}
}clearArray(v8,true);
funsortedRightNeighbors(v12);int v16 = 0;
for(v16=0;(v16<length((List<Node>)copyEdgeArrayToNodeArray(v8,1)));v16=v16+1){{
if((getArrayIndex(v10,null,v12)!=null)){{
{if ((getArrayIndex(v8,null,v16)!=null?((Edge)(getArrayIndex(v8,null,v16))).node:null)!=null) (getArrayIndex(v8,null,v16)!=null?((Edge)(getArrayIndex(v8,null,v16))).node:null).send("linearize",false,getArrayIndex(v10,null,v12));}
}
}}
}clearArray(v8,true);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p17) { callCounterlinearize++; try {
String v18 = "";
v18=funbitfolge(id(p17));
int v19 = 0;
HashMap<String, simulator.Node> v20 = new HashMap<String, simulator.Node>();
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p17)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p17))))).node:null)==p17)){{
print((("Node "+id(p17))+" already forgotten"));{if(this.TRUE)return ;}}
}if((p17==null)){{
print("Null Node linearized");{if(this.TRUE)return ;}}
}if((p17==this)){{
print("Self loop");{if(this.TRUE)return ;}}
}for(v19=0;(v19<v1);v19=v19+1){{
if((funcheckIfNodeOnLevel(v19, p17)==this.TRUE)){{
boolean v21 = false;
v21=funCheckIfNodeInRange(v19, p17);
boolean v22 = ((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null)==null);
boolean v23 = ((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null)==null);
boolean v24 = ((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null)==null);
boolean v25 = ((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null)==null);
boolean v26 = (funinteger(sub_str(v18, v19, (v19+1)))==0);
if(((v22&&v26)&&(id(p17)<id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_pred0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v23&&(!v26))&&(id(p17)<id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_pred1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v24&&v26)&&(id(p17)>id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_succ0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v25&&(!v26))&&(id(p17)>id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_succ1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(v21){{
if((id(p17)>id(this))){{
if((funinteger(sub_str(v18, v19, (v19+1)))==1)){{
if((id(p17)<id((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null)))){{
print(((("better succ_1 found: "+id(p17))+" is new succ1 instead of ")+id((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_succ1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
}}
} else {{
if((id(p17)<id((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null)))){{
print(((("better succ_0 found: "+id(p17))+" is new succ0 instead of ")+id((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_succ0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
}}
}}
}if((id(p17)<id(this))){{
if((funinteger(sub_str(v18, v19, (v19+1)))==1)){{
if((id(p17)>id((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null)))){{
print(((("better pred_1 found: "+id(p17))+" is new pred_1 instead of ")+id((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_pred1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
}}
} else {{
if((id(p17)>id((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null)))){{
print(((("better pred_0 found: "+id(p17))+" is new pred_0 instead of ")+id((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_pred0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
}}
}}
}}
}}}}}}
}}
}for(v19=0;(v19<v1);v19=v19+1){{
for(Entry<?,?> ev5:v5.entrySet()){
String i27=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i28=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(v19, i28)==this.TRUE)){{
boolean v29 = false;
v29=funCheckIfNodeInRange(v19, i28);
if((i28==null)){{
print("neighbor is null because we set it to null (forget node)");}
}if((v29&&(i28!=null))){{
setArrayIndex('=',v20,Arrays.asList(i27),i28,null,0);
}
}}
}}

}
}
}List<simulator.Node> v30 = new ArrayList<simulator.Node>();
int v31 = 0;
for(Entry<?,?> ev5:v5.entrySet()){
String i32=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i33=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((i33!=null)){{
if((getArrayIndex(v20,null,i32)==null)){{
setArrayIndex('=',v30,Arrays.asList(v31),i33,null,1);
print(("to be forwarded: "+id(i33)));v31=v31+1;
}
}}
}}

}
clearArray(v5,true);
for(Entry<?,?> ev20:v20.entrySet()){
String i34=(String) (ev20.getKey() instanceof Edge ? ((Edge)ev20.getKey()).node : ev20.getKey());
simulator.Node i35=(simulator.Node) (ev20.getValue() instanceof Edge ? ((Edge)ev20.getValue()).node : ev20.getValue());
{
updateVisualization(v5,i35,true,"black",0,i34);
}

}
for(simulator.Node i36:createIterable(v30)){{
funforwardNode(i36);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p37) { callCounterentry++; try {
funlinearize(p37);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountersearch;
protected void funsearch(int p38) { callCountersearch++; try {
print(("search "+p38));if((p38==id(this))){{
print((("Node "+id(this))+" found!"));{if(this.TRUE)return ;}}
}simulator.Node v39 = null;
for(Entry<?,?> ev5:v5.entrySet()){
String i40=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i41=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((id(i41)==p38)){{
v39=i41;
{if(this.TRUE)break;}}
}if((p38<id(this))){{
if(((id(i41)<id(this))&&(id(i41)>p38))){{
if(((v39==null)||(id(i41)<id(v39)))){{
v39=i41;
}
}}
}}
} else {if((p38>id(this))){{
if(((id(i41)>id(this))&&(id(i41)<p38))){{
if(((v39==null)||(id(i41)>id(v39)))){{
v39=i41;
}
}}
}}
}}}

}
if((v39==null)){{
print("Can not find node");}
} else {{
{if (v39!=null) v39.send("search",false,p38);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in search: "+e.getMessage()); } return ;} long callCounterforgetNode;
protected void funforgetNode(simulator.Node p42) { callCounterforgetNode++; try {
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p42)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p42))))).node:null)==p42)){{
print((("Node "+id(p42))+" already forgotten"));{if(this.TRUE)return ;}}
}print(("Forget Node "+id(p42)));updateVisualization(v6,p42,true,"red",0,funbitfolge(id(p42)));
int v43 = 0;
for(v43=0;(v43<v1);v43=v43+1){{
if(((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_pred0"));
}
} else {if(((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null).send("forgetNode",false,p42);}
}
}}if(((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_pred1"));
}
} else {if(((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null).send("forgetNode",false,p42);}
}
}}if(((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_succ0"));
}
} else {if(((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null).send("forgetNode",false,p42);}
}
}}if(((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_succ1"));
}
} else {if(((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null).send("forgetNode",false,p42);}
}
}}}
}for(Entry<?,?> ev5:v5.entrySet()){
String i44=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i45=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((i45==p42)){{
updateVisualization(v5,null,true,"black",0,i44);
}
} else {if((i45!=null)){{
{if (i45!=null) i45.send("forgetNode",false,p42);}
}
}}}

}
}
 catch (ArithmeticException e){ print("arithmetic exception in forgetNode: "+e.getMessage()); } return ;} long callCounterbroadcast;
protected void funbroadcast(String p46, int p47) { callCounterbroadcast++; try {
if(!(getArrayIndex(v7,"",p47)==null?p46==null:getArrayIndex(v7,"",p47).equals(p46))){{
print(("Got Message: "+p46));setArrayIndex('=',v7,Arrays.asList(p47),p46,"",0);
for(Entry<?,?> ev5:v5.entrySet()){
String i48=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i49=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
{if (i49!=null) i49.send("broadcast",false,p46, p47);}
}

}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in broadcast: "+e.getMessage()); } return ;} long callCounterdelete;
protected void fundelete() { callCounterdelete++; try {
int v50 = 0;
for(v50=0;(v50<v1);v50=v50+1){{
if(((getArrayIndex(v4,null,(v50+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v50+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred0")))).node:null)!=null) (getArrayIndex(v4,null,(v50+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred0")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v50+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v50+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred1")))).node:null)!=null) (getArrayIndex(v4,null,(v50+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_pred1")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v50+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v50+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ0")))).node:null)!=null) (getArrayIndex(v4,null,(v50+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ0")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v50+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v50+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ1")))).node:null)!=null) (getArrayIndex(v4,null,(v50+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v50+"_succ1")))).node:null).send("forgetNode",false,this);}
}
}}
}v3=this.TRUE;
clearArray(v5,true);
clearArray(v4,true);
}
 catch (ArithmeticException e){ print("arithmetic exception in delete: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p51) { callCounterinteger++; try {
if((p51==null?"1"==null:p51.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p52, simulator.Node p53) { callCountercheckIfNodeOnLevel++; try {
int v54 = 0;
v54=funlongestCommonPrefix(v2, funbitfolge(id(p53)));
if((v54>=p52)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p55) { callCounterbitfolge++; try {
int v56 = 97;
int v57 = (((p55*37)+17)%v56);
int v58 = 0;
String v59 = "";
int v60 = 0;
for(v60=0;(v60<v1);v60=v60+1){{
v58=(v57%2);
if((v58==1)){{
v59=("1"+v59);
}
} else {{
v59=("0"+v59);
}
}v57=(v57/2);
}
}{if(this.TRUE)return v59;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p61) { callCounterminPred++; try {
simulator.Node v62 = null;
simulator.Node v63 = null;
v62=(getArrayIndex(v4,null,(p61+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(p61+"_pred0")))).node:null);
v63=(getArrayIndex(v4,null,(p61+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(p61+"_pred1")))).node:null);
if(((v62==null)&&(v63==null))){{
{if(this.TRUE)return null;}}
}if((v62==null)){{
{if(this.TRUE)return v63;}}
}if((v63==null)){{
{if(this.TRUE)return v62;}}
}if((id(v62)<id(v63))){{
{if(this.TRUE)return v62;}}
} else {{
{if(this.TRUE)return v63;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v64 = 0;
simulator.Node v65 = null;
v65=funminPred(0);
for(v64=1;(v64<v1);v64=v64+1){{
if((id(v65)>id(funminPred(v64)))){{
v65=funminPred(v64);
}
}}
}{if(this.TRUE)return v65;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p66) { callCountermaxSucc++; try {
simulator.Node v67 = null;
simulator.Node v68 = null;
v67=(getArrayIndex(v4,null,(p66+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(p66+"_succ0")))).node:null);
v68=(getArrayIndex(v4,null,(p66+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(p66+"_succ1")))).node:null);
simulator.Node v69 = null;
if((id(v67)>id(v68))){{
v69=v67;
}
} else {{
v69=v68;
}
}{if(this.TRUE)return v69;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v70 = 0;
simulator.Node v71 = null;
v71=funmaxSucc(0);
for(v70=1;(v70<v1);v70=v70+1){{
if((id(v71)<id(funmaxSucc(v70)))){{
v71=funmaxSucc(v70);
}
}}
}{if(this.TRUE)return v71;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p72, String p73) { callCounterlongestCommonPrefix++; try {
int v74 = 0;
int v75 = 0;
v75=0;
for(v74=0;(v74<v1);v74=v74+1){{
if((sub_str(p72, v74, (v74+1))==null?sub_str(p73, v74, (v74+1))==null:sub_str(p72, v74, (v74+1)).equals(sub_str(p73, v74, (v74+1))))){{
v75=v75+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v75;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p76) { callCountergetLongestCommonPrefixNode++; try {
int v77 = 0;
simulator.Node v78 = null;
v77=(-1);
v78=null;
for(Entry<?,?> ev5:v5.entrySet()){
String i79=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i80=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if(!(p76==null?i79==null:p76.equals(i79))){{
int v81 = 0;
v81=funlongestCommonPrefix(p76, i79);
if((v81>v77)){{
v77=v81;
v78=i80;
}
}}
}}

}
if((v78==null)){{
print("nextNode is null");}
}{if(this.TRUE)return v78;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p82, simulator.Node p83) { callCounterCheckIfNodeInRange++; try {
simulator.Node v84 = funminPred(p82);
simulator.Node v85 = funmaxSucc(p82);
boolean v86 = false;
v86=this.FALSE;
if(((v84!=null)&&(v85!=null))){{
boolean v87 = false;
v87=this.FALSE;
boolean v88 = false;
v88=this.FALSE;
if((id(p83)>id(v85))){{
v87=this.TRUE;
}
}if((id(p83)<id(v84))){{
v88=this.TRUE;
}
}v86=(!(v87||v88));
}
} else {if(((v84==null)&&(v85==null))){{
v86=this.TRUE;
}
} else {if((((v84==null)&&(v85!=null))&&(id(p83)<=id(v85)))){{
v86=this.TRUE;
}
} else {if((((v84!=null)&&(v85==null))&&(id(p83)>=id(v84)))){{
v86=this.TRUE;
}
}}}}{if(this.TRUE)return v86;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p89) { callCounterforwardNode++; try {
if(((getArrayIndex(v6,null,funbitfolge(id(p89)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p89))))).node:null)==p89)){{
print((("Node "+id(p89))+" already forgotten - do not forward"));{if(this.TRUE)return ;}}
}if((p89==null)){{
{if(this.TRUE)return ;}}
}simulator.Node v90 = null;
String v91 = "";
v91=funbitfolge(id(p89));
v90=fungetLongestCommonPrefixNode(v91);
if((v90!=null)){{
{if (v90!=null) v90.send("linearize",false,p89);}
}
} else {{
print("Neiiiin - longestCommonPrefixNode is null");{if (this!=null) this.send("linearize",false,p89);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p92) { callCountersortedLeftNeighbors++; try {
int v93 = 0;
clearArray(v8,true);
for(Entry<?,?> ev5:v5.entrySet()){
String i94=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i95=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(p92, i95)&&(id(i95)<id(this)))){{
updateVisualization(v8,i95,true,"black",1,v93);
v93=(v93+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p96) { callCountersortedRightNeighbors++; try {
int v97 = 0;
clearArray(v8,true);
for(Entry<?,?> ev5:v5.entrySet()){
String i98=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i99=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(p96, i99)&&(id(i99)>id(this)))){{
updateVisualization(v8,i99,true,"black",1,v97);
v97=(v97+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v100 = 0;
v100=length((List<Node>)copyEdgeArrayToNodeArray(v8,1));
int v101 = 0;
int v102 = 0;
simulator.Node v103 = null;
for(v101=0;(v101<(v100-1));v101=v101+1){{
for(v102=0;(v102<((v100-v101)-1));v102=v102+1){{
if((id((getArrayIndex(v8,null,v102)!=null?((Edge)(getArrayIndex(v8,null,v102))).node:null))>id((getArrayIndex(v8,null,(v102+1))!=null?((Edge)(getArrayIndex(v8,null,(v102+1)))).node:null)))){{
v103=(getArrayIndex(v8,null,v102)!=null?((Edge)(getArrayIndex(v8,null,v102))).node:null);
updateVisualization(v8,(getArrayIndex(v8,null,(v102+1))!=null?((Edge)(getArrayIndex(v8,null,(v102+1)))).node:null),true,"black",1,v102);
updateVisualization(v8,v103,true,"black",1,(v102+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
