// VAuD_Project/skip+
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
List<Edge> v7 = new ArrayList<Edge>();
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("limit",v1), 
new SimpleEntry<String, Object>("bitString",v2), 
new SimpleEntry<String, Object>("deleted",v3), 
new SimpleEntry<String, Object>("succPredList",v4), 
new SimpleEntry<String, Object>("neighbors",v5), 
new SimpleEntry<String, Object>("toBeDeleted",v6), 
new SimpleEntry<String, Object>("tempArray",v7)};}
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
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forwardNode_old",new SimpleEntry[] {
new SimpleEntry<String, String>("forwardedNode", "simulator.Node")}));
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
attr.add(new SimpleEntry<String, Long>("forwardNode_old",callCounterforwardNode_old));
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
if (params[0].equals("forwardNode_old")){
funforwardNode_old((simulator.Node)params[2]);if ((boolean)params[1]){
print("forwardNode_old returned");
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
int v8 = 0;
for(v8=0;(v8<v1);v8=v8+1){{
updateVisualization(v4,null,true,"black",0,(v8+"_succ0"));
updateVisualization(v4,null,true,"black",0,(v8+"_succ1"));
updateVisualization(v4,null,true,"black",0,(v8+"_pred0"));
updateVisualization(v4,null,true,"black",0,(v8+"_pred1"));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
List<simulator.Node> v9 = new ArrayList<simulator.Node>();
List<simulator.Node> v10 = new ArrayList<simulator.Node>();
clearArray(v7,true);
int v11 = 0;
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}for(v11=0;(v11<v1);v11=v11+1){{
funsortedLeftNeighbors(v11);int v12 = 0;
for(v12=(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1);(v12>1);v12=v12-1){{
{if ((getArrayIndex(v7,null,v12)!=null?((Edge)(getArrayIndex(v7,null,v12))).node:null)!=null) (getArrayIndex(v7,null,v12)!=null?((Edge)(getArrayIndex(v7,null,v12))).node:null).send("linearize",false,(getArrayIndex(v7,null,(v12-1))!=null?((Edge)(getArrayIndex(v7,null,(v12-1)))).node:null));}
if(((getArrayIndex(v7,null,(v12-1))!=null?((Edge)(getArrayIndex(v7,null,(v12-1)))).node:null)==null)){{
print(("tempArray[i-1] is null with i = "+v12));}
}}
}if(((getArrayIndex(v7,null,0)!=null?((Edge)(getArrayIndex(v7,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v7,null,0)!=null?((Edge)(getArrayIndex(v7,null,0))).node:null)!=null) (getArrayIndex(v7,null,0)!=null?((Edge)(getArrayIndex(v7,null,0))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v9,Arrays.asList(v11),(getArrayIndex(v7,null,0)!=null?((Edge)(getArrayIndex(v7,null,0))).node:null),null,1);
clearArray(v7,true);
funsortedRightNeighbors(v11);int v13 = 0;
for(v13=0;(v13<(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1));v13=v13+1){{
{if ((getArrayIndex(v7,null,v13)!=null?((Edge)(getArrayIndex(v7,null,v13))).node:null)!=null) (getArrayIndex(v7,null,v13)!=null?((Edge)(getArrayIndex(v7,null,v13))).node:null).send("linearize",false,(getArrayIndex(v7,null,(v13+1))!=null?((Edge)(getArrayIndex(v7,null,(v13+1)))).node:null));}
if(((getArrayIndex(v7,null,(v13+1))!=null?((Edge)(getArrayIndex(v7,null,(v13+1)))).node:null)==null)){{
print(("tempArray[j+1] is null with j = "+v13));}
}}
}if(((getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1))!=null?((Edge)(getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1)))).node:null)!=null)){{
{if ((getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1))!=null?((Edge)(getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1)))).node:null)!=null) (getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1))!=null?((Edge)(getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1)))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v10,Arrays.asList(v11),(getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1))!=null?((Edge)(getArrayIndex(v7,null,(length((List<Node>)copyEdgeArrayToNodeArray(v7,1))-1)))).node:null),null,1);
}
}for(v11=0;(v11<v1);v11=v11+1){{
clearArray(v7,true);
funsortedLeftNeighbors(v11);int v14 = 0;
for(v14=0;(v14<length((List<Node>)copyEdgeArrayToNodeArray(v7,1)));v14=v14+1){{
if((getArrayIndex(v10,null,v11)!=null)){{
{if ((getArrayIndex(v7,null,v14)!=null?((Edge)(getArrayIndex(v7,null,v14))).node:null)!=null) (getArrayIndex(v7,null,v14)!=null?((Edge)(getArrayIndex(v7,null,v14))).node:null).send("linearize",false,getArrayIndex(v10,null,v11));}
}
}}
}clearArray(v7,true);
funsortedRightNeighbors(v11);int v15 = 0;
for(v15=0;(v15<length((List<Node>)copyEdgeArrayToNodeArray(v7,1)));v15=v15+1){{
if((getArrayIndex(v9,null,v11)!=null)){{
{if ((getArrayIndex(v7,null,v15)!=null?((Edge)(getArrayIndex(v7,null,v15))).node:null)!=null) (getArrayIndex(v7,null,v15)!=null?((Edge)(getArrayIndex(v7,null,v15))).node:null).send("linearize",false,getArrayIndex(v9,null,v11));}
}
}}
}clearArray(v7,true);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p16) { callCounterlinearize++; try {
String v17 = "";
v17=funbitfolge(id(p16));
int v18 = 0;
HashMap<String, simulator.Node> v19 = new HashMap<String, simulator.Node>();
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p16)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p16))))).node:null)==p16)){{
print((("Node "+id(p16))+" already forgotten"));{if(this.TRUE)return ;}}
}if((p16==null)){{
print("Null Node linearized");{if(this.TRUE)return ;}}
}if((p16==this)){{
print("Self loop");{if(this.TRUE)return ;}}
}for(v18=0;(v18<v1);v18=v18+1){{
if((funcheckIfNodeOnLevel(v18, p16)==this.TRUE)){{
boolean v20 = false;
v20=funCheckIfNodeInRange(v18, p16);
boolean v21 = ((getArrayIndex(v4,null,(v18+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred0")))).node:null)==null);
boolean v22 = ((getArrayIndex(v4,null,(v18+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred1")))).node:null)==null);
boolean v23 = ((getArrayIndex(v4,null,(v18+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ0")))).node:null)==null);
boolean v24 = ((getArrayIndex(v4,null,(v18+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ1")))).node:null)==null);
boolean v25 = (funinteger(sub_str(v17, v18, (v18+1)))==0);
if(((v21&&v25)&&(id(p16)<id(this)))){{
updateVisualization(v4,p16,true,"black",0,(v18+"_pred0"));
updateVisualization(v5,p16,true,"black",0,v17);
}
} else {if(((v22&&(!v25))&&(id(p16)<id(this)))){{
updateVisualization(v4,p16,true,"black",0,(v18+"_pred1"));
updateVisualization(v5,p16,true,"black",0,v17);
}
} else {if(((v23&&v25)&&(id(p16)>id(this)))){{
updateVisualization(v4,p16,true,"black",0,(v18+"_succ0"));
updateVisualization(v5,p16,true,"black",0,v17);
}
} else {if(((v24&&(!v25))&&(id(p16)>id(this)))){{
updateVisualization(v4,p16,true,"black",0,(v18+"_succ1"));
updateVisualization(v5,p16,true,"black",0,v17);
}
} else {if(v20){{
if((id(p16)>id(this))){{
if((funinteger(sub_str(v17, v18, (v18+1)))==1)){{
if((id(p16)<id((getArrayIndex(v4,null,(v18+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ1")))).node:null)))){{
print(((("better succ_1 found: "+id(p16))+" is new succ1 instead of ")+id((getArrayIndex(v4,null,(v18+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ1")))).node:null))));updateVisualization(v4,p16,true,"black",0,(v18+"_succ1"));
updateVisualization(v5,p16,true,"black",0,v17);
}
}}
} else {{
if((id(p16)<id((getArrayIndex(v4,null,(v18+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ0")))).node:null)))){{
print(((("better succ_0 found: "+id(p16))+" is new succ0 instead of ")+id((getArrayIndex(v4,null,(v18+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ0")))).node:null))));updateVisualization(v4,p16,true,"black",0,(v18+"_succ0"));
updateVisualization(v5,p16,true,"black",0,v17);
}
}}
}}
}if((id(p16)<id(this))){{
if((funinteger(sub_str(v17, v18, (v18+1)))==1)){{
if((id(p16)>id((getArrayIndex(v4,null,(v18+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred1")))).node:null)))){{
print(((("better pred_1 found: "+id(p16))+" is new pred_1 instead of ")+id((getArrayIndex(v4,null,(v18+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred1")))).node:null))));updateVisualization(v4,p16,true,"black",0,(v18+"_pred1"));
updateVisualization(v5,p16,true,"black",0,v17);
}
}}
} else {{
if((id(p16)>id((getArrayIndex(v4,null,(v18+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred0")))).node:null)))){{
print(((("better pred_0 found: "+id(p16))+" is new pred_0 instead of ")+id((getArrayIndex(v4,null,(v18+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred0")))).node:null))));updateVisualization(v4,p16,true,"black",0,(v18+"_pred0"));
updateVisualization(v5,p16,true,"black",0,v17);
}
}}
}}
}}
}}}}}for(Entry<?,?> ev5:v5.entrySet()){
String i26=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i27=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
v20=funCheckIfNodeInRange(v18, i27);
if((i27==null)){{
print("NEEEEIIIIINNNNN");}
}if(((((v20||((getArrayIndex(v4,null,(v18+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred0")))).node:null)==i27))||((getArrayIndex(v4,null,(v18+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_pred1")))).node:null)==i27))||((getArrayIndex(v4,null,(v18+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ0")))).node:null)==i27))||((getArrayIndex(v4,null,(v18+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v18+"_succ1")))).node:null)==i27))){{
setArrayIndex('=',v19,Arrays.asList(i26),i27,null,0);
}
}}

}
}
}}
}List<simulator.Node> v28 = new ArrayList<simulator.Node>();
int v29 = 0;
v29=0;
for(Entry<?,?> ev5:v5.entrySet()){
String i30=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i31=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((getArrayIndex(v19,null,i30)==null)){{
setArrayIndex('=',v28,Arrays.asList(v29),i31,null,1);
print(("to be forwarded: "+id(i31)));v29=v29+1;
}
}}

}
clearArray(v5,true);
for(Entry<?,?> ev19:v19.entrySet()){
String i32=(String) (ev19.getKey() instanceof Edge ? ((Edge)ev19.getKey()).node : ev19.getKey());
simulator.Node i33=(simulator.Node) (ev19.getValue() instanceof Edge ? ((Edge)ev19.getValue()).node : ev19.getValue());
{
updateVisualization(v5,i33,true,"black",0,i32);
}

}
for(simulator.Node i34:createIterable(v28)){{
funforwardNode_old(i34);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p35) { callCounterentry++; try {
funlinearize(p35);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountersearch;
protected void funsearch(int p36) { callCountersearch++; try {
String v37 = "";
v37=funbitfolge(p36);
if(((getArrayIndex(v5,null,v37)!=null?((Edge)(getArrayIndex(v5,null,v37))).node:null)!=null)){{
print(("Found: "+(getArrayIndex(v5,null,v37)!=null?((Edge)(getArrayIndex(v5,null,v37))).node:null)));}
} else {{
simulator.Node v38 = null;
v38=fungetLongestCommonPrefixNode(v2);
{if (v38!=null) v38.send("search",false,p36);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in search: "+e.getMessage()); } return ;} long callCounterforgetNode;
protected void funforgetNode(simulator.Node p39) { callCounterforgetNode++; try {
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p39)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p39))))).node:null)==p39)){{
print((("Node "+id(p39))+" already forgotten"));{if(this.TRUE)return ;}}
}print(("Forget Node "+id(p39)));updateVisualization(v6,p39,true,"blue",0,funbitfolge(id(p39)));
int v40 = 0;
for(v40=0;(v40<v1);v40=v40+1){{
if(((getArrayIndex(v4,null,(v40+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred0")))).node:null)==p39)){{
updateVisualization(v4,null,true,"black",0,(v40+"_pred0"));
}
} else {if(((getArrayIndex(v4,null,(v40+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v40+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred0")))).node:null)!=null) (getArrayIndex(v4,null,(v40+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred0")))).node:null).send("forgetNode",false,p39);}
}
}}if(((getArrayIndex(v4,null,(v40+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred1")))).node:null)==p39)){{
updateVisualization(v4,null,true,"black",0,(v40+"_pred1"));
}
} else {if(((getArrayIndex(v4,null,(v40+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v40+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred1")))).node:null)!=null) (getArrayIndex(v4,null,(v40+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_pred1")))).node:null).send("forgetNode",false,p39);}
}
}}if(((getArrayIndex(v4,null,(v40+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ0")))).node:null)==p39)){{
updateVisualization(v4,null,true,"black",0,(v40+"_succ0"));
}
} else {if(((getArrayIndex(v4,null,(v40+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v40+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ0")))).node:null)!=null) (getArrayIndex(v4,null,(v40+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ0")))).node:null).send("forgetNode",false,p39);}
}
}}if(((getArrayIndex(v4,null,(v40+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ1")))).node:null)==p39)){{
updateVisualization(v4,null,true,"black",0,(v40+"_succ1"));
}
} else {if(((getArrayIndex(v4,null,(v40+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v40+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ1")))).node:null)!=null) (getArrayIndex(v4,null,(v40+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v40+"_succ1")))).node:null).send("forgetNode",false,p39);}
}
}}}
}for(Entry<?,?> ev5:v5.entrySet()){
String i41=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i42=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((i42==p39)){{
updateVisualization(v5,null,true,"black",0,i41);
}
} else {if((i42!=null)){{
{if (i42!=null) i42.send("forgetNode",false,p39);}
}
}}}

}
}
 catch (ArithmeticException e){ print("arithmetic exception in forgetNode: "+e.getMessage()); } return ;} long callCounterdelete;
protected void fundelete() { callCounterdelete++; try {
int v43 = 0;
for(v43=0;(v43<v1);v43=v43+1){{
if(((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null).send("forgetNode",false,this);}
}
}if(((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)!=null)){{
{if ((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)!=null) (getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null).send("forgetNode",false,this);}
}
}}
}v3=this.TRUE;
clearArray(v5,true);
clearArray(v4,true);
}
 catch (ArithmeticException e){ print("arithmetic exception in delete: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p44) { callCounterinteger++; try {
if((p44==null?"1"==null:p44.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p45, simulator.Node p46) { callCountercheckIfNodeOnLevel++; try {
int v47 = 0;
v47=funlongestCommonPrefix(v2, funbitfolge(id(p46)));
if((v47>=p45)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p48) { callCounterbitfolge++; try {
int v49 = 97;
int v50 = (((p48*37)+17)%v49);
int v51 = 0;
String v52 = "";
int v53 = 0;
for(v53=0;(v53<v1);v53=v53+1){{
v51=(v50%2);
if((v51==1)){{
v52=("1"+v52);
}
} else {{
v52=("0"+v52);
}
}v50=(v50/2);
}
}{if(this.TRUE)return v52;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p54) { callCounterminPred++; try {
simulator.Node v55 = null;
simulator.Node v56 = null;
v55=(getArrayIndex(v4,null,(p54+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(p54+"_pred0")))).node:null);
v56=(getArrayIndex(v4,null,(p54+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(p54+"_pred1")))).node:null);
if(((v55==null)&&(v56==null))){{
{if(this.TRUE)return null;}}
}if((v55==null)){{
{if(this.TRUE)return v56;}}
}if((v56==null)){{
{if(this.TRUE)return v55;}}
}if((id(v55)<id(v56))){{
{if(this.TRUE)return v55;}}
} else {{
{if(this.TRUE)return v56;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v57 = 0;
simulator.Node v58 = null;
v58=funminPred(0);
for(v57=1;(v57<v1);v57=v57+1){{
if((id(v58)>id(funminPred(v57)))){{
v58=funminPred(v57);
}
}}
}{if(this.TRUE)return v58;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p59) { callCountermaxSucc++; try {
simulator.Node v60 = null;
simulator.Node v61 = null;
v60=(getArrayIndex(v4,null,(p59+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(p59+"_succ0")))).node:null);
v61=(getArrayIndex(v4,null,(p59+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(p59+"_succ1")))).node:null);
simulator.Node v62 = null;
if((id(v60)>id(v61))){{
v62=v60;
}
} else {{
v62=v61;
}
}{if(this.TRUE)return v62;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v63 = 0;
simulator.Node v64 = null;
v64=funmaxSucc(0);
for(v63=1;(v63<v1);v63=v63+1){{
if((id(v64)<id(funmaxSucc(v63)))){{
v64=funmaxSucc(v63);
}
}}
}{if(this.TRUE)return v64;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p65, String p66) { callCounterlongestCommonPrefix++; try {
int v67 = 0;
int v68 = 0;
v68=0;
for(v67=0;(v67<v1);v67=v67+1){{
if((sub_str(p65, v67, (v67+1))==null?sub_str(p66, v67, (v67+1))==null:sub_str(p65, v67, (v67+1)).equals(sub_str(p66, v67, (v67+1))))){{
v68=v68+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v68;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p69) { callCountergetLongestCommonPrefixNode++; try {
int v70 = 0;
simulator.Node v71 = null;
v70=(-1);
v71=null;
for(Entry<?,?> ev5:v5.entrySet()){
String i72=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i73=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if(!(p69==null?i72==null:p69.equals(i72))){{
int v74 = 0;
v74=funlongestCommonPrefix(p69, i72);
if((v74>v70)){{
v70=v74;
v71=i73;
}
}}
}}

}
if((v71==null)){{
print("nextNode is null");}
}{if(this.TRUE)return v71;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p75, simulator.Node p76) { callCounterCheckIfNodeInRange++; try {
simulator.Node v77 = funminPred(p75);
simulator.Node v78 = funmaxSucc(p75);
boolean v79 = false;
v79=this.FALSE;
if(((v77!=null)&&(v78!=null))){{
boolean v80 = false;
v80=this.FALSE;
boolean v81 = false;
v81=this.FALSE;
if((id(p76)>id(v78))){{
v80=this.TRUE;
}
}if((id(p76)<id(v77))){{
v81=this.TRUE;
}
}v79=(!(v80||v81));
if(((v79==this.FALSE)&&(id(p76)==1))){{
}
}}
} else {if(((v77==null)&&(v78==null))){{
v79=this.TRUE;
}
} else {if((((v77==null)&&(v78!=null))&&(id(p76)<=id(v78)))){{
v79=this.TRUE;
}
} else {if((((v77!=null)&&(v78==null))&&(id(p76)>=id(v77)))){{
v79=this.TRUE;
}
}}}}{if(this.TRUE)return v79;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode_old;
protected void funforwardNode_old(simulator.Node p82) { callCounterforwardNode_old++; try {
if(((getArrayIndex(v6,null,funbitfolge(id(p82)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p82))))).node:null)==p82)){{
print((("Node "+id(p82))+" already forgotten - do not forward"));{if(this.TRUE)return ;}}
}simulator.Node v83 = null;
String v84 = "";
v84=funbitfolge(id(p82));
v83=fungetLongestCommonPrefixNode(v84);
if((v83!=null)){{
{if (v83!=null) v83.send("linearize",false,p82);}
if((p82==null)){{
print("forwardedNode is null");}
}}
} else {{
print("Neiiiin");{if (this!=null) this.send("linearize",false,p82);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode_old: "+e.getMessage()); } return ;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p85) { callCounterforwardNode++; try {
simulator.Node v86 = null;
if((p85==null)){{
print("forwardedNode is null");}
}if((id(p85)<id(this))){{
v86=funglobalMinPred();
{if (v86!=null) v86.send("linearize",false,p85);}
}
} else {if((id(p85)>id(this))){{
v86=funglobalMaxSucc();
{if (v86!=null) v86.send("linearize",false,p85);}
}
} else {{
}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p87) { callCountersortedLeftNeighbors++; try {
int v88 = 0;
clearArray(v7,true);
for(Entry<?,?> ev5:v5.entrySet()){
String i89=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i90=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(p87, i90)&&(id(i90)<id(this)))){{
updateVisualization(v7,i90,true,"black",1,v88);
v88=(v88+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p91) { callCountersortedRightNeighbors++; try {
int v92 = 0;
clearArray(v7,true);
for(Entry<?,?> ev5:v5.entrySet()){
String i93=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i94=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(p91, i94)&&(id(i94)>id(this)))){{
updateVisualization(v7,i94,true,"black",1,v92);
v92=(v92+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v95 = 0;
v95=length((List<Node>)copyEdgeArrayToNodeArray(v7,1));
int v96 = 0;
int v97 = 0;
simulator.Node v98 = null;
for(v96=0;(v96<(v95-1));v96=v96+1){{
for(v97=0;(v97<((v95-v96)-1));v97=v97+1){{
if((id((getArrayIndex(v7,null,v97)!=null?((Edge)(getArrayIndex(v7,null,v97))).node:null))>id((getArrayIndex(v7,null,(v97+1))!=null?((Edge)(getArrayIndex(v7,null,(v97+1)))).node:null)))){{
v98=(getArrayIndex(v7,null,v97)!=null?((Edge)(getArrayIndex(v7,null,v97))).node:null);
updateVisualization(v7,(getArrayIndex(v7,null,(v97+1))!=null?((Edge)(getArrayIndex(v7,null,(v97+1)))).node:null),true,"black",1,v97);
updateVisualization(v7,v98,true,"black",1,(v97+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
