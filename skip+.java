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
int v1 = 6;
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
attr.add(new SimpleEntry<String, Entry<String, String>[]>("join",new SimpleEntry[] {
new SimpleEntry<String, String>("C", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("search",new SimpleEntry[] {
new SimpleEntry<String, String>("searchedId", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forgetNode",new SimpleEntry[] {
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("broadcast",new SimpleEntry[] {
new SimpleEntry<String, String>("message", "String"), 
new SimpleEntry<String, String>("message_id", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("leave",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("integer",new SimpleEntry[] {
new SimpleEntry<String, String>("x", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("checkIfNodeOnLevel",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int"), 
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
attr.add(new SimpleEntry<String, Entry<String, String>[]>("checkIfNodeInRange",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int"), 
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forwardNode",new SimpleEntry[] {
new SimpleEntry<String, String>("forwardedNode", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedLeftNeighbors",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedRightNeighbors",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
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
attr.add(new SimpleEntry<String, Long>("join",callCounterjoin));
attr.add(new SimpleEntry<String, Long>("search",callCountersearch));
attr.add(new SimpleEntry<String, Long>("forgetNode",callCounterforgetNode));
attr.add(new SimpleEntry<String, Long>("broadcast",callCounterbroadcast));
attr.add(new SimpleEntry<String, Long>("leave",callCounterleave));
attr.add(new SimpleEntry<String, Long>("integer",callCounterinteger));
attr.add(new SimpleEntry<String, Long>("checkIfNodeOnLevel",callCountercheckIfNodeOnLevel));
attr.add(new SimpleEntry<String, Long>("bitfolge",callCounterbitfolge));
attr.add(new SimpleEntry<String, Long>("minPred",callCounterminPred));
attr.add(new SimpleEntry<String, Long>("globalMinPred",callCounterglobalMinPred));
attr.add(new SimpleEntry<String, Long>("maxSucc",callCountermaxSucc));
attr.add(new SimpleEntry<String, Long>("globalMaxSucc",callCounterglobalMaxSucc));
attr.add(new SimpleEntry<String, Long>("longestCommonPrefix",callCounterlongestCommonPrefix));
attr.add(new SimpleEntry<String, Long>("getLongestCommonPrefixNode",callCountergetLongestCommonPrefixNode));
attr.add(new SimpleEntry<String, Long>("checkIfNodeInRange",callCountercheckIfNodeInRange));
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
if (params[0].equals("join")){
funjoin((simulator.Node)params[2]);if ((boolean)params[1]){
print("join returned");
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
if (params[0].equals("leave")){
funleave();if ((boolean)params[1]){
print("leave returned");
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
if (params[0].equals("checkIfNodeInRange")){
Object result = funcheckIfNodeInRange((int)params[2], (simulator.Node)params[3]);
if ((boolean)params[1]){
print("checkIfNodeInRange returns " + result);
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
if((v3==this.TRUE)){{
{if(this.TRUE)return ;}}
}List<simulator.Node> v10 = new ArrayList<simulator.Node>();
List<simulator.Node> v11 = new ArrayList<simulator.Node>();
clearArray(v8,true);
int v12 = 0;
for(v12=0;(v12<v1);v12=v12+1){{
funsortedLeftNeighbors(v12);int v13 = 0;
for(v13=(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1);(v13>0);v13=v13-1){{
{if ((getArrayIndex(v8,null,v13)!=null?((Edge)(getArrayIndex(v8,null,v13))).node:null)!=null) (getArrayIndex(v8,null,v13)!=null?((Edge)(getArrayIndex(v8,null,v13))).node:null).send("linearize",false,(getArrayIndex(v8,null,(v13-1))!=null?((Edge)(getArrayIndex(v8,null,(v13-1)))).node:null));}
}
}if(((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null)!=null) (getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v10,Arrays.asList(v12),(getArrayIndex(v8,null,0)!=null?((Edge)(getArrayIndex(v8,null,0))).node:null),null,1);
clearArray(v8,true);
funsortedRightNeighbors(v12);int v14 = 0;
for(v14=0;(v14<(length((List<Node>)copyEdgeArrayToNodeArray(v8,1))-1));v14=v14+1){{
{if ((getArrayIndex(v8,null,v14)!=null?((Edge)(getArrayIndex(v8,null,v14))).node:null)!=null) (getArrayIndex(v8,null,v14)!=null?((Edge)(getArrayIndex(v8,null,v14))).node:null).send("linearize",false,(getArrayIndex(v8,null,(v14+1))!=null?((Edge)(getArrayIndex(v8,null,(v14+1)))).node:null));}
}
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
if(v3){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p17)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p17))))).node:null)==p17)){{
{if(this.TRUE)return ;}}
}if((p17==null)){{
{if(this.TRUE)return ;}}
}if((p17==this)){{
{if(this.TRUE)return ;}}
}for(v19=0;(v19<v1);v19=v19+1){{
if(funcheckIfNodeOnLevel(v19, p17)){{
boolean v21 = ((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null)==null);
boolean v22 = ((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null)==null);
boolean v23 = ((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null)==null);
boolean v24 = ((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null)==null);
boolean v25 = (funinteger(sub_str(v18, v19, (v19+1)))==0);
if(((v21&&v25)&&(id(p17)<id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_pred0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v22&&(!v25))&&(id(p17)<id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_pred1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v23&&v25)&&(id(p17)>id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_succ0"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(((v24&&(!v25))&&(id(p17)>id(this)))){{
updateVisualization(v4,p17,true,"black",0,(v19+"_succ1"));
updateVisualization(v5,p17,true,"black",0,v18);
}
} else {if(funcheckIfNodeInRange(v19, p17)){{
updateVisualization(v5,p17,true,"black",0,v18);
if((id(p17)>id(this))){{
if((funinteger(sub_str(v18, v19, (v19+1)))==1)){{
if((id(p17)<id((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null)))){{
print(((("better succ_1 found: "+id(p17))+" is new succ1 instead of ")+id((getArrayIndex(v4,null,(v19+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ1")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_succ1"));
}
}}
} else {{
if((id(p17)<id((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null)))){{
print(((("better succ_0 found: "+id(p17))+" is new succ0 instead of ")+id((getArrayIndex(v4,null,(v19+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_succ0")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_succ0"));
}
}}
}}
}if((id(p17)<id(this))){{
if((funinteger(sub_str(v18, v19, (v19+1)))==1)){{
if((id(p17)>id((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null)))){{
print(((("better pred_1 found: "+id(p17))+" is new pred_1 instead of ")+id((getArrayIndex(v4,null,(v19+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred1")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_pred1"));
}
}}
} else {{
if((id(p17)>id((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null)))){{
print(((("better pred_0 found: "+id(p17))+" is new pred_0 instead of ")+id((getArrayIndex(v4,null,(v19+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v19+"_pred0")))).node:null))));updateVisualization(v4,p17,true,"black",0,(v19+"_pred0"));
}
}}
}}
}}
}}}}}}
}}
}for(v19=0;(v19<v1);v19=v19+1){{
for(Entry<?,?> ev5:v5.entrySet()){
String i26=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i27=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if(funcheckIfNodeOnLevel(v19, i27)){{
boolean v28 = false;
v28=funcheckIfNodeInRange(v19, i27);
if((v28&&(i27!=null))){{
setArrayIndex('=',v20,Arrays.asList(i26),i27,null,0);
}
}}
}}

}
}
}List<simulator.Node> v29 = new ArrayList<simulator.Node>();
int v30 = 0;
for(Entry<?,?> ev5:v5.entrySet()){
String i31=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i32=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if(((i32!=null)&&(getArrayIndex(v20,null,i31)==null))){{
setArrayIndex('=',v29,Arrays.asList(v30),i32,null,1);
v30=v30+1;
}
}}

}
clearArray(v5,true);
for(Entry<?,?> ev20:v20.entrySet()){
String i33=(String) (ev20.getKey() instanceof Edge ? ((Edge)ev20.getKey()).node : ev20.getKey());
simulator.Node i34=(simulator.Node) (ev20.getValue() instanceof Edge ? ((Edge)ev20.getValue()).node : ev20.getValue());
{
updateVisualization(v5,i34,true,"black",0,i33);
}

}
for(simulator.Node i35:createIterable(v29)){{
funforwardNode(i35);}
}if(((getArrayIndex(v5,null,v2)!=null?((Edge)(getArrayIndex(v5,null,v2))).node:null)==null)){{
funforwardNode(p17);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p36) { callCounterentry++; try {
funlinearize(p36);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterjoin;
protected void funjoin(simulator.Node p37) { callCounterjoin++; try {
funlinearize(p37);}
 catch (ArithmeticException e){ print("arithmetic exception in join: "+e.getMessage()); } return ;} long callCountersearch;
protected void funsearch(int p38) { callCountersearch++; try {
if((p38==id(this))){{
print((("Node "+id(this))+" found!"));{if(this.TRUE)return ;}}
}print(("Searching for node "+p38));simulator.Node v39 = null;
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
if(v3){{
{if(this.TRUE)return ;}}
}if(((getArrayIndex(v6,null,funbitfolge(id(p42)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p42))))).node:null)==p42)){{
{if(this.TRUE)return ;}}
}updateVisualization(v6,p42,true,"red",0,funbitfolge(id(p42)));
int v43 = 0;
for(Entry<?,?> ev5:v5.entrySet()){
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
for(v43=0;(v43<v1);v43=v43+1){{
if(((getArrayIndex(v4,null,(v43+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred0")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_pred0"));
}
}if(((getArrayIndex(v4,null,(v43+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_pred1")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_pred1"));
}
}if(((getArrayIndex(v4,null,(v43+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ0")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_succ0"));
}
}if(((getArrayIndex(v4,null,(v43+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(v43+"_succ1")))).node:null)==p42)){{
updateVisualization(v4,null,true,"black",0,(v43+"_succ1"));
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forgetNode: "+e.getMessage()); } return ;} long callCounterbroadcast;
protected void funbroadcast(String p46, int p47) { callCounterbroadcast++; try {
if((getArrayIndex(v7,"",p47)==null?""==null:getArrayIndex(v7,"",p47).equals(""))){{
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
 catch (ArithmeticException e){ print("arithmetic exception in broadcast: "+e.getMessage()); } return ;} long callCounterleave;
protected void funleave() { callCounterleave++; try {
for(Entry<?,?> ev5:v5.entrySet()){
String i50=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i51=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
{if (i51!=null) i51.send("forgetNode",false,this);}
}

}
v3=this.TRUE;
clearArray(v5,true);
clearArray(v4,true);
}
 catch (ArithmeticException e){ print("arithmetic exception in leave: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p52) { callCounterinteger++; try {
if((p52==null?"1"==null:p52.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p53, simulator.Node p54) { callCountercheckIfNodeOnLevel++; try {
int v55 = 0;
v55=funlongestCommonPrefix(v2, funbitfolge(id(p54)));
if((v55>=p53)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p56) { callCounterbitfolge++; try {
int v57 = 97;
int v58 = (((p56*37)+17)%v57);
int v59 = 0;
String v60 = "";
int v61 = 0;
for(v61=0;(v61<v1);v61=v61+1){{
v59=(v58%2);
if((v59==1)){{
v60=("1"+v60);
}
} else {{
v60=("0"+v60);
}
}v58=(v58/2);
}
}{if(this.TRUE)return v60;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p62) { callCounterminPred++; try {
simulator.Node v63 = null;
simulator.Node v64 = null;
v63=(getArrayIndex(v4,null,(p62+"_pred0"))!=null?((Edge)(getArrayIndex(v4,null,(p62+"_pred0")))).node:null);
v64=(getArrayIndex(v4,null,(p62+"_pred1"))!=null?((Edge)(getArrayIndex(v4,null,(p62+"_pred1")))).node:null);
if(((v63==null)&&(v64==null))){{
{if(this.TRUE)return null;}}
}if((v63==null)){{
{if(this.TRUE)return v64;}}
}if((v64==null)){{
{if(this.TRUE)return v63;}}
}if((id(v63)<id(v64))){{
{if(this.TRUE)return v63;}}
} else {{
{if(this.TRUE)return v64;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v65 = 0;
simulator.Node v66 = null;
v66=funminPred(0);
for(v65=1;(v65<v1);v65=v65+1){{
if((id(v66)>id(funminPred(v65)))){{
v66=funminPred(v65);
}
}}
}{if(this.TRUE)return v66;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p67) { callCountermaxSucc++; try {
simulator.Node v68 = null;
simulator.Node v69 = null;
v68=(getArrayIndex(v4,null,(p67+"_succ0"))!=null?((Edge)(getArrayIndex(v4,null,(p67+"_succ0")))).node:null);
v69=(getArrayIndex(v4,null,(p67+"_succ1"))!=null?((Edge)(getArrayIndex(v4,null,(p67+"_succ1")))).node:null);
if(((v68==null)&&(v69==null))){{
{if(this.TRUE)return null;}}
}if((v68==null)){{
{if(this.TRUE)return v69;}}
}if((v69==null)){{
{if(this.TRUE)return v68;}}
}if((id(v68)>id(v69))){{
{if(this.TRUE)return v68;}}
} else {{
{if(this.TRUE)return v69;}}
}}
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
{if(this.TRUE)return v78;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCountercheckIfNodeInRange;
protected boolean funcheckIfNodeInRange(int p82, simulator.Node p83) { callCountercheckIfNodeInRange++; try {
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
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p89) { callCounterforwardNode++; try {
if(((getArrayIndex(v6,null,funbitfolge(id(p89)))!=null?((Edge)(getArrayIndex(v6,null,funbitfolge(id(p89))))).node:null)==p89)){{
{if(this.TRUE)return ;}}
}if((p89==null)){{
{if(this.TRUE)return ;}}
}simulator.Node v90 = null;
String v91 = "";
v91=funbitfolge(id(p89));
v90=fungetLongestCommonPrefixNode(v91);
{if (v90!=null) v90.send("linearize",false,p89);}
}
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
if((p92==0)){{
List<simulator.Node> v96 = new ArrayList<simulator.Node>();
int v97 = 0;
for(Entry<?,?> ev5:v5.entrySet()){
String i98=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i99=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((id(i99)<id(this))){{
setArrayIndex('=',v96,Arrays.asList(v97),i99,null,1);
v97=(v97+1);
}
}}

}
}
}funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p100) { callCountersortedRightNeighbors++; try {
int v101 = 0;
clearArray(v8,true);
for(Entry<?,?> ev5:v5.entrySet()){
String i102=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i103=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((funcheckIfNodeOnLevel(p100, i103)&&(id(i103)>id(this)))){{
updateVisualization(v8,i103,true,"black",1,v101);
v101=(v101+1);
}
}}

}
if((p100==0)){{
List<simulator.Node> v104 = new ArrayList<simulator.Node>();
int v105 = 0;
for(Entry<?,?> ev5:v5.entrySet()){
String i106=(String) (ev5.getKey() instanceof Edge ? ((Edge)ev5.getKey()).node : ev5.getKey());
simulator.Node i107=(simulator.Node) (ev5.getValue() instanceof Edge ? ((Edge)ev5.getValue()).node : ev5.getValue());
{
if((id(i107)>id(this))){{
setArrayIndex('=',v104,Arrays.asList(v105),i107,null,1);
v105=(v105+1);
}
}}

}
}
}funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v108 = 0;
v108=length((List<Node>)copyEdgeArrayToNodeArray(v8,1));
int v109 = 0;
int v110 = 0;
simulator.Node v111 = null;
for(v109=0;(v109<(v108-1));v109=v109+1){{
for(v110=0;(v110<((v108-v109)-1));v110=v110+1){{
if((id((getArrayIndex(v8,null,v110)!=null?((Edge)(getArrayIndex(v8,null,v110))).node:null))>id((getArrayIndex(v8,null,(v110+1))!=null?((Edge)(getArrayIndex(v8,null,(v110+1)))).node:null)))){{
v111=(getArrayIndex(v8,null,v110)!=null?((Edge)(getArrayIndex(v8,null,v110))).node:null);
updateVisualization(v8,(getArrayIndex(v8,null,(v110+1))!=null?((Edge)(getArrayIndex(v8,null,(v110+1)))).node:null),true,"black",1,v110);
updateVisualization(v8,v111,true,"black",1,(v110+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
