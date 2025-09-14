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
HashMap<String, Edge> v3 = new HashMap<String, Edge>();
HashMap<String, Edge> v4 = new HashMap<String, Edge>();
List<Edge> v5 = new ArrayList<Edge>();
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("limit",v1), 
new SimpleEntry<String, Object>("bitString",v2), 
new SimpleEntry<String, Object>("succPredList",v3), 
new SimpleEntry<String, Object>("neighbors",v4), 
new SimpleEntry<String, Object>("tempArray",v5)};}
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
int v6 = 0;
for(v6=0;(v6<v1);v6=v6+1){{
updateVisualization(v3,null,true,"black",0,(v6+"_succ0"));
updateVisualization(v3,null,true,"black",0,(v6+"_succ1"));
updateVisualization(v3,null,true,"black",0,(v6+"_pred0"));
updateVisualization(v3,null,true,"black",0,(v6+"_pred1"));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
List<simulator.Node> v7 = new ArrayList<simulator.Node>();
List<simulator.Node> v8 = new ArrayList<simulator.Node>();
clearArray(v5,true);
int v9 = 0;
for(v9=0;(v9<v1);v9=v9+1){{
funsortedLeftNeighbors(v9);int v10 = 0;
for(v10=(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1);(v10>1);v10=v10-1){{
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null));}
if(((getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null)==null)){{
print(("tempArray[i-1] is null with i = "+v10));}
}}
}if(((getArrayIndex(v5,null,0)!=null?((Edge)(getArrayIndex(v5,null,0))).node:null)!=null)){{
{if ((getArrayIndex(v5,null,0)!=null?((Edge)(getArrayIndex(v5,null,0))).node:null)!=null) (getArrayIndex(v5,null,0)!=null?((Edge)(getArrayIndex(v5,null,0))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v7,Arrays.asList(v9),(getArrayIndex(v5,null,0)!=null?((Edge)(getArrayIndex(v5,null,0))).node:null),null,1);
clearArray(v5,true);
funsortedRightNeighbors(v9);int v11 = 0;
for(v11=0;(v11<(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1));v11=v11+1){{
{if ((getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null)!=null) (getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v11+1))!=null?((Edge)(getArrayIndex(v5,null,(v11+1)))).node:null));}
if(((getArrayIndex(v5,null,(v11+1))!=null?((Edge)(getArrayIndex(v5,null,(v11+1)))).node:null)==null)){{
print(("tempArray[j+1] is null with j = "+v11));}
}}
}if(((getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1))!=null?((Edge)(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1)))).node:null)!=null)){{
{if ((getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1))!=null?((Edge)(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1)))).node:null)!=null) (getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1))!=null?((Edge)(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1)))).node:null).send("linearize",false,this);}
}
}setArrayIndex('=',v8,Arrays.asList(v9),(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1))!=null?((Edge)(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1)))).node:null),null,1);
}
}for(v9=0;(v9<v1);v9=v9+1){{
clearArray(v5,true);
funsortedLeftNeighbors(v9);int v12 = 0;
for(v12=0;(v12<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v12=v12+1){{
if((getArrayIndex(v8,null,v9)!=null)){{
{if ((getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null)!=null) (getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null).send("linearize",false,getArrayIndex(v8,null,v9));}
}
}}
}clearArray(v5,true);
funsortedRightNeighbors(v9);int v13 = 0;
for(v13=0;(v13<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v13=v13+1){{
if((getArrayIndex(v7,null,v9)!=null)){{
{if ((getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null)!=null) (getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null).send("linearize",false,getArrayIndex(v7,null,v9));}
}
}}
}clearArray(v5,true);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p14) { callCounterlinearize++; try {
String v15 = "";
v15=funbitfolge(id(p14));
int v16 = 0;
HashMap<String, simulator.Node> v17 = new HashMap<String, simulator.Node>();
if((p14==null)){{
print("Null Node linearized");{if(this.TRUE)return ;}}
}if((p14==this)){{
print("Self edge");{if(this.TRUE)return ;}}
}for(v16=0;(v16<v1);v16=v16+1){{
if((funcheckIfNodeOnLevel(v16, p14)==this.TRUE)){{
boolean v18 = false;
v18=funCheckIfNodeInRange(v16, p14);
boolean v19 = ((getArrayIndex(v3,null,(v16+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred0")))).node:null)==null);
boolean v20 = ((getArrayIndex(v3,null,(v16+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred1")))).node:null)==null);
boolean v21 = ((getArrayIndex(v3,null,(v16+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ0")))).node:null)==null);
boolean v22 = ((getArrayIndex(v3,null,(v16+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ1")))).node:null)==null);
boolean v23 = (funinteger(sub_str(v15, v16, (v16+1)))==0);
if(((v19&&v23)&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
} else {if(((v20&&(!v23))&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
} else {if(((v21&&v23)&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
} else {if(((v22&&(!v23))&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
} else {if(v18){{
if((id(p14)>id(this))){{
if((funinteger(sub_str(v15, v16, (v16+1)))==1)){{
if((id(p14)<id((getArrayIndex(v3,null,(v16+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ1")))).node:null)))){{
print(((("better succ_1 found: "+id(p14))+" is new succ1 instead of ")+id((getArrayIndex(v3,null,(v16+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ1")))).node:null))));updateVisualization(v3,p14,true,"black",0,(v16+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
}}
} else {{
if((id(p14)<id((getArrayIndex(v3,null,(v16+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ0")))).node:null)))){{
print(((("better succ_0 found: "+id(p14))+" is new succ0 instead of ")+id((getArrayIndex(v3,null,(v16+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ0")))).node:null))));updateVisualization(v3,p14,true,"black",0,(v16+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
}}
}}
}if((id(p14)<id(this))){{
if((funinteger(sub_str(v15, v16, (v16+1)))==1)){{
if((id(p14)>id((getArrayIndex(v3,null,(v16+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred1")))).node:null)))){{
print(((("better pred_1 found: "+id(p14))+" is new pred_1 instead of ")+id((getArrayIndex(v3,null,(v16+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred1")))).node:null))));updateVisualization(v3,p14,true,"black",0,(v16+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
}}
} else {{
if((id(p14)>id((getArrayIndex(v3,null,(v16+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred0")))).node:null)))){{
print(((("better pred_0 found: "+id(p14))+" is new pred_0 instead of ")+id((getArrayIndex(v3,null,(v16+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred0")))).node:null))));updateVisualization(v3,p14,true,"black",0,(v16+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
setArrayIndex('=',v17,Arrays.asList(v15),p14,null,0);
}
}}
}}
}}
}}}}}for(Entry<?,?> ev4:v4.entrySet()){
String i24=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i25=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
v18=funCheckIfNodeInRange(v16, i25);
if((i25==null)){{
print("NEEEEIIIIINNNNN");}
}if(((((v18||((getArrayIndex(v3,null,(v16+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred0")))).node:null)==i25))||((getArrayIndex(v3,null,(v16+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred1")))).node:null)==i25))||((getArrayIndex(v3,null,(v16+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ0")))).node:null)==i25))||((getArrayIndex(v3,null,(v16+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ1")))).node:null)==i25))){{
setArrayIndex('=',v17,Arrays.asList(i24),i25,null,0);
}
}}

}
}
}}
}List<simulator.Node> v26 = new ArrayList<simulator.Node>();
int v27 = 0;
v27=0;
for(Entry<?,?> ev4:v4.entrySet()){
String i28=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i29=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((getArrayIndex(v17,null,i28)==null)){{
setArrayIndex('=',v26,Arrays.asList(v27),i29,null,1);
print(("to be forwarded: "+id(i29)));v27=v27+1;
}
}}

}
clearArray(v4,true);
for(Entry<?,?> ev17:v17.entrySet()){
String i30=(String) (ev17.getKey() instanceof Edge ? ((Edge)ev17.getKey()).node : ev17.getKey());
simulator.Node i31=(simulator.Node) (ev17.getValue() instanceof Edge ? ((Edge)ev17.getValue()).node : ev17.getValue());
{
updateVisualization(v4,i31,true,"black",0,i30);
}

}
for(simulator.Node i32:createIterable(v26)){{
funforwardNode_old(i32);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p33) { callCounterentry++; try {
funlinearize(p33);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountersearch;
protected void funsearch(int p34) { callCountersearch++; try {
String v35 = "";
v35=funbitfolge(p34);
if(((getArrayIndex(v4,null,v35)!=null?((Edge)(getArrayIndex(v4,null,v35))).node:null)!=null)){{
print(("Found: "+(getArrayIndex(v4,null,v35)!=null?((Edge)(getArrayIndex(v4,null,v35))).node:null)));}
} else {{
simulator.Node v36 = null;
v36=fungetLongestCommonPrefixNode(v2);
{if (v36!=null) v36.send("search",false,p34);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in search: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p37) { callCounterinteger++; try {
if((p37==null?"1"==null:p37.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p38, simulator.Node p39) { callCountercheckIfNodeOnLevel++; try {
int v40 = 0;
v40=funlongestCommonPrefix(v2, funbitfolge(id(p39)));
if((v40>=p38)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p41) { callCounterbitfolge++; try {
int v42 = 97;
int v43 = (((p41*37)+17)%v42);
int v44 = 0;
String v45 = "";
int v46 = 0;
for(v46=0;(v46<v1);v46=v46+1){{
v44=(v43%2);
if((v44==1)){{
v45=("1"+v45);
}
} else {{
v45=("0"+v45);
}
}v43=(v43/2);
}
}{if(this.TRUE)return v45;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p47) { callCounterminPred++; try {
simulator.Node v48 = null;
simulator.Node v49 = null;
v48=(getArrayIndex(v3,null,(p47+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p47+"_pred0")))).node:null);
v49=(getArrayIndex(v3,null,(p47+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p47+"_pred1")))).node:null);
if(((v48==null)&&(v49==null))){{
{if(this.TRUE)return null;}}
}if((v48==null)){{
{if(this.TRUE)return v49;}}
}if((v49==null)){{
{if(this.TRUE)return v48;}}
}if((id(v48)<id(v49))){{
{if(this.TRUE)return v48;}}
} else {{
{if(this.TRUE)return v49;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v50 = 0;
simulator.Node v51 = null;
v51=funminPred(0);
for(v50=1;(v50<v1);v50=v50+1){{
if((id(v51)>id(funminPred(v50)))){{
v51=funminPred(v50);
}
}}
}{if(this.TRUE)return v51;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p52) { callCountermaxSucc++; try {
simulator.Node v53 = null;
simulator.Node v54 = null;
v53=(getArrayIndex(v3,null,(p52+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p52+"_succ0")))).node:null);
v54=(getArrayIndex(v3,null,(p52+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p52+"_succ1")))).node:null);
simulator.Node v55 = null;
if((id(v53)>id(v54))){{
v55=v53;
}
} else {{
v55=v54;
}
}{if(this.TRUE)return v55;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v56 = 0;
simulator.Node v57 = null;
v57=funmaxSucc(0);
for(v56=1;(v56<v1);v56=v56+1){{
if((id(v57)<id(funmaxSucc(v56)))){{
v57=funmaxSucc(v56);
}
}}
}{if(this.TRUE)return v57;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p58, String p59) { callCounterlongestCommonPrefix++; try {
int v60 = 0;
int v61 = 0;
v61=0;
for(v60=0;(v60<v1);v60=v60+1){{
if((sub_str(p58, v60, (v60+1))==null?sub_str(p59, v60, (v60+1))==null:sub_str(p58, v60, (v60+1)).equals(sub_str(p59, v60, (v60+1))))){{
v61=v61+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v61;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p62) { callCountergetLongestCommonPrefixNode++; try {
int v63 = 0;
simulator.Node v64 = null;
v63=(-1);
v64=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i65=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i66=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p62==null?i65==null:p62.equals(i65))){{
int v67 = 0;
v67=funlongestCommonPrefix(p62, i65);
if((v67>v63)){{
v63=v67;
v64=i66;
}
}}
}}

}
if((v64==null)){{
print("nextNode is null");}
}{if(this.TRUE)return v64;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p68, simulator.Node p69) { callCounterCheckIfNodeInRange++; try {
simulator.Node v70 = funminPred(p68);
simulator.Node v71 = funmaxSucc(p68);
boolean v72 = false;
v72=this.FALSE;
if(((v70!=null)&&(v71!=null))){{
boolean v73 = false;
v73=this.FALSE;
boolean v74 = false;
v74=this.FALSE;
if((id(p69)>id(v71))){{
v73=this.TRUE;
}
}if((id(p69)<id(v70))){{
v74=this.TRUE;
}
}v72=(!(v73||v74));
if(((v72==this.FALSE)&&(id(p69)==1))){{
print(("v: "+id(p69)));print(("minPred: "+id(v70)));print(("maxSucc: "+id(v71)));}
}}
} else {if(((v70==null)&&(v71==null))){{
v72=this.TRUE;
}
} else {if((((v70==null)&&(v71!=null))&&(id(p69)<=id(v71)))){{
v72=this.TRUE;
}
} else {if((((v70!=null)&&(v71==null))&&(id(p69)>=id(v70)))){{
v72=this.TRUE;
}
}}}}{if(this.TRUE)return v72;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode_old;
protected void funforwardNode_old(simulator.Node p75) { callCounterforwardNode_old++; try {
simulator.Node v76 = null;
String v77 = "";
v77=funbitfolge(id(p75));
v76=fungetLongestCommonPrefixNode(v77);
if((v76!=null)){{
{if (v76!=null) v76.send("linearize",false,p75);}
if((p75==null)){{
print("forwardedNode is null");}
}}
} else {{
print("Neiiiin");{if (this!=null) this.send("linearize",false,p75);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode_old: "+e.getMessage()); } return ;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p78) { callCounterforwardNode++; try {
simulator.Node v79 = null;
if((p78==null)){{
print("forwardedNode is null");}
}if((id(p78)<id(this))){{
v79=funglobalMinPred();
{if (v79!=null) v79.send("linearize",false,p78);}
}
} else {if((id(p78)>id(this))){{
v79=funglobalMaxSucc();
{if (v79!=null) v79.send("linearize",false,p78);}
}
} else {{
}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p80) { callCountersortedLeftNeighbors++; try {
int v81 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i82=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i83=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p80, i83)&&(id(i83)<id(this)))){{
updateVisualization(v5,i83,true,"black",1,v81);
v81=(v81+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p84) { callCountersortedRightNeighbors++; try {
int v85 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i86=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i87=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p84, i87)&&(id(i87)>id(this)))){{
updateVisualization(v5,i87,true,"black",1,v85);
v85=(v85+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v88 = 0;
v88=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));
int v89 = 0;
int v90 = 0;
simulator.Node v91 = null;
for(v89=0;(v89<(v88-1));v89=v89+1){{
for(v90=0;(v90<((v88-v89)-1));v90=v90+1){{
if((id((getArrayIndex(v5,null,v90)!=null?((Edge)(getArrayIndex(v5,null,v90))).node:null))>id((getArrayIndex(v5,null,(v90+1))!=null?((Edge)(getArrayIndex(v5,null,(v90+1)))).node:null)))){{
v91=(getArrayIndex(v5,null,v90)!=null?((Edge)(getArrayIndex(v5,null,v90))).node:null);
updateVisualization(v5,(getArrayIndex(v5,null,(v90+1))!=null?((Edge)(getArrayIndex(v5,null,(v90+1)))).node:null),true,"black",1,v90);
updateVisualization(v5,v91,true,"black",1,(v90+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
