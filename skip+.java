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
funsortedLeftNeighbors(v9);print(length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));int v10 = 0;
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
clearArray(v17,false);
if((p14==null)){{
print("Null Node linearized");{if(this.TRUE)return ;}}
}if((p14==this)){{
print("Self edge");{if(this.TRUE)return ;}}
}for(v16=0;(v16<v1);v16=v16+1){{
if((funcheckIfNodeOnLevel(v16, p14)==this.TRUE)){{
boolean v18 = false;
boolean v19 = false;
v19=((getArrayIndex(v3,null,(v16+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred0")))).node:null)==null);
boolean v20 = false;
v20=((getArrayIndex(v3,null,(v16+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_pred1")))).node:null)==null);
boolean v21 = false;
v21=((getArrayIndex(v3,null,(v16+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ0")))).node:null)==null);
boolean v22 = false;
v22=((getArrayIndex(v3,null,(v16+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v16+"_succ1")))).node:null)==null);
boolean v23 = false;
v23=(funinteger(sub_str(v15, v16, (v16+1)))==0);
if(((v19&&v23)&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v20&&(!v23))&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v21&&v23)&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v22&&(!v23))&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
v18=funCheckIfNodeInRange(v16, p14);
if(v18){{
if((id(p14)>id(this))){{
if((funinteger(sub_str(v15, v16, (v16+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v16+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
}if((id(p14)<id(this))){{
if((funinteger(sub_str(v15, v16, (v16+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v16+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
}}
}}
}for(Entry<?,?> ev4:v4.entrySet()){
String i24=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i25=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
v18=funCheckIfNodeInRange(v16, i25);
if(v18){{
setArrayIndex('=',v17,Arrays.asList(i24),i25,null,0);
}
}}

}
}
}}
}List<simulator.Node> v26 = new ArrayList<simulator.Node>();
int v27 = 0;
v27=(-1);
for(Entry<?,?> ev4:v4.entrySet()){
String i28=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i29=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((getArrayIndex(v17,null,i28)==null)){{
v27=v27+1;
setArrayIndex('=',v26,Arrays.asList(v27),i29,null,1);
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
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p34) { callCounterinteger++; try {
if((p34==null?"1"==null:p34.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p35, simulator.Node p36) { callCountercheckIfNodeOnLevel++; try {
int v37 = 0;
v37=funlongestCommonPrefix(v2, funbitfolge(id(p36)));
if((v37>=p35)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p38) { callCounterbitfolge++; try {
int v39 = 97;
int v40 = (((p38*37)+17)%v39);
int v41 = 0;
String v42 = "";
int v43 = 0;
for(v43=0;(v43<v1);v43=v43+1){{
v41=(v40%2);
if((v41==1)){{
v42=("1"+v42);
}
} else {{
v42=("0"+v42);
}
}v40=(v40/2);
}
}{if(this.TRUE)return v42;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p44) { callCounterminPred++; try {
simulator.Node v45 = null;
simulator.Node v46 = null;
v45=(getArrayIndex(v3,null,(p44+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p44+"_pred0")))).node:null);
v46=(getArrayIndex(v3,null,(p44+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p44+"_pred1")))).node:null);
if(((v45==null)&&(v46!=null))){{
print("pred0 sollte nicht null sein");{if(this.TRUE)return v46;}}
} else {if(((v45!=null)&&(v46==null))){{
print("pred1 sollte nicht null sein");{if(this.TRUE)return v45;}}
}}simulator.Node v47 = null;
if((id(v45)<id(v46))){{
v47=v45;
}
} else {{
v47=v46;
}
}{if(this.TRUE)return v47;}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v48 = 0;
simulator.Node v49 = null;
v49=funminPred(0);
for(v48=1;(v48<v1);v48=v48+1){{
if((id(v49)>id(funminPred(v48)))){{
v49=funminPred(v48);
}
}}
}{if(this.TRUE)return v49;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p50) { callCountermaxSucc++; try {
simulator.Node v51 = null;
simulator.Node v52 = null;
v51=(getArrayIndex(v3,null,(p50+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p50+"_succ0")))).node:null);
v52=(getArrayIndex(v3,null,(p50+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p50+"_succ1")))).node:null);
simulator.Node v53 = null;
if((id(v51)>id(v52))){{
v53=v51;
}
} else {{
v53=v52;
}
}{if(this.TRUE)return v53;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v54 = 0;
simulator.Node v55 = null;
v55=funmaxSucc(0);
for(v54=1;(v54<v1);v54=v54+1){{
if((id(v55)<id(funmaxSucc(v54)))){{
v55=funmaxSucc(v54);
}
}}
}{if(this.TRUE)return v55;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p56, String p57) { callCounterlongestCommonPrefix++; try {
int v58 = 0;
int v59 = 0;
v59=0;
for(v58=0;(v58<v1);v58=v58+1){{
if((sub_str(p56, v58, (v58+1))==null?sub_str(p57, v58, (v58+1))==null:sub_str(p56, v58, (v58+1)).equals(sub_str(p57, v58, (v58+1))))){{
v59=v59+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v59;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p60) { callCountergetLongestCommonPrefixNode++; try {
int v61 = 0;
simulator.Node v62 = null;
v61=(-1);
v62=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i63=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i64=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p60==null?i63==null:p60.equals(i63))){{
int v65 = 0;
v65=funlongestCommonPrefix(p60, i63);
if((v65>v61)){{
v61=v65;
v62=i64;
}
}}
}}

}
{if(this.TRUE)return v62;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p66, simulator.Node p67) { callCounterCheckIfNodeInRange++; try {
simulator.Node v68 = funminPred(p66);
simulator.Node v69 = funmaxSucc(p66);
boolean v70 = false;
v70=this.FALSE;
if(((v68!=null)&&(v69!=null))){{
boolean v71 = false;
v71=this.FALSE;
boolean v72 = false;
v72=this.FALSE;
if((id(p67)>=id(v69))){{
v71=this.TRUE;
}
}if((id(p67)<=id(v68))){{
v72=this.TRUE;
}
}v70=(!(v71||v72));
}
} else {if(((v68==null)&&(v69==null))){{
v70=this.TRUE;
}
} else {if((((v68==null)&&(v69!=null))&&(id(p67)<=id(v69)))){{
v70=this.TRUE;
}
} else {if((((v68!=null)&&(v69==null))&&(id(p67)>=id(v68)))){{
v70=this.TRUE;
}
}}}}{if(this.TRUE)return v70;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode_old;
protected void funforwardNode_old(simulator.Node p73) { callCounterforwardNode_old++; try {
simulator.Node v74 = null;
String v75 = "";
v75=funbitfolge(id(p73));
v74=fungetLongestCommonPrefixNode(v75);
if((v74!=null)){{
{if (v74!=null) v74.send("linearize",false,p73);}
if((p73==null)){{
print("forwardedNode is null");}
}}
} else {{
print("Neiiiin");{if (this!=null) this.send("linearize",false,p73);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode_old: "+e.getMessage()); } return ;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p76) { callCounterforwardNode++; try {
simulator.Node v77 = null;
if((p76==null)){{
print("forwardedNode is null");}
}if((id(p76)<id(this))){{
v77=funglobalMinPred();
{if (v77!=null) v77.send("linearize",false,p76);}
}
} else {if((id(p76)>id(this))){{
v77=funglobalMaxSucc();
{if (v77!=null) v77.send("linearize",false,p76);}
}
} else {{
}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p78) { callCountersortedLeftNeighbors++; try {
int v79 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i80=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i81=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p78, i81)&&(id(i81)<id(this)))){{
updateVisualization(v5,i81,true,"black",1,v79);
v79=(v79+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p82) { callCountersortedRightNeighbors++; try {
int v83 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i84=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i85=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p82, i85)&&(id(i85)>id(this)))){{
updateVisualization(v5,i85,true,"black",1,v83);
v83=(v83+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v86 = 0;
v86=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));
int v87 = 0;
int v88 = 0;
simulator.Node v89 = null;
for(v87=0;(v87<(v86-1));v87=v87+1){{
for(v88=0;(v88<((v86-v87)-1));v88=v88+1){{
if((id((getArrayIndex(v5,null,v88)!=null?((Edge)(getArrayIndex(v5,null,v88))).node:null))>id((getArrayIndex(v5,null,(v88+1))!=null?((Edge)(getArrayIndex(v5,null,(v88+1)))).node:null)))){{
v89=(getArrayIndex(v5,null,v88)!=null?((Edge)(getArrayIndex(v5,null,v88))).node:null);
updateVisualization(v5,(getArrayIndex(v5,null,(v88+1))!=null?((Edge)(getArrayIndex(v5,null,(v88+1)))).node:null),true,"black",1,v88);
updateVisualization(v5,v89,true,"black",1,(v88+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
