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
new SimpleEntry<String, String>("wBit", "String")}));
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
funsortedLeftNeighbors(v9);int v10 = 0;
for(v10=(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1);(v10>1);v10=v10-1){{
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null));}
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,this);}
}
}{if ((getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null)!=null) (getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null).send("linearize",false,this);}
setArrayIndex('=',v7,Arrays.asList(v9),(getArrayIndex(v5,null,0)!=null?((Edge)(getArrayIndex(v5,null,0))).node:null),null,1);
clearArray(v5,true);
funsortedRightNeighbors(v9);int v11 = 0;
for(v11=0;(v11<(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1));v11=v11+1){{
{if ((getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null)!=null) (getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v11+1))!=null?((Edge)(getArrayIndex(v5,null,(v11+1)))).node:null));}
{if ((getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null)!=null) (getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null).send("linearize",false,this);}
}
}{if ((getArrayIndex(v5,null,(v11+1))!=null?((Edge)(getArrayIndex(v5,null,(v11+1)))).node:null)!=null) (getArrayIndex(v5,null,(v11+1))!=null?((Edge)(getArrayIndex(v5,null,(v11+1)))).node:null).send("linearize",false,this);}
setArrayIndex('=',v8,Arrays.asList(v9),(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1))!=null?((Edge)(getArrayIndex(v5,null,(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1)))).node:null),null,1);
}
}for(v9=0;(v9<v1);v9=v9+1){{
clearArray(v5,true);
funsortedLeftNeighbors(v9);int v12 = 0;
for(v12=0;(v12<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v12=v12+1){{
{if ((getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null)!=null) (getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null).send("linearize",false,getArrayIndex(v8,null,v9));}
}
}clearArray(v5,true);
funsortedRightNeighbors(v9);int v13 = 0;
for(v13=0;(v13<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v13=v13+1){{
{if ((getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null)!=null) (getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null).send("linearize",false,getArrayIndex(v7,null,v9));}
}
}clearArray(v5,true);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p14) { callCounterlinearize++; try {
String v15 = "";
v15=funbitfolge(id(p14));
boolean v16 = false;
v16=this.FALSE;
int v17 = 0;
HashMap<String, simulator.Node> v18 = new HashMap<String, simulator.Node>();
if((p14==null)){{
print("Null Node linearized");{if(this.TRUE)return ;}}
}if((p14==this)){{
print("Self edge");{if(this.TRUE)return ;}}
}for(v17=0;(v17<v1);v17=v17+1){{
if((funcheckIfNodeOnLevel(v17, p14)==this.TRUE)){{
boolean v19 = false;
boolean v20 = false;
v20=((getArrayIndex(v3,null,(v17+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(v17+"_pred0")))).node:null)==null);
boolean v21 = false;
v21=((getArrayIndex(v3,null,(v17+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(v17+"_pred1")))).node:null)==null);
boolean v22 = false;
v22=((getArrayIndex(v3,null,(v17+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(v17+"_succ0")))).node:null)==null);
boolean v23 = false;
v23=((getArrayIndex(v3,null,(v17+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(v17+"_succ1")))).node:null)==null);
boolean v24 = false;
v24=(funinteger(sub_str(v15, v17, (v17+1)))==0);
if(((v20&&v24)&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v21&&(!v24))&&(id(p14)<id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v22&&v24)&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v23&&(!v24))&&(id(p14)>id(this)))){{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}v19=funCheckIfNodeInRange(v17, p14);
if((funminPred(v17)==null)){{
if((id(p14)<id(this))){{
v16=this.TRUE;
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
} else {{
v19=this.FALSE;
}
}}
}if((funmaxSucc(v17)==null)){{
if((id(p14)>id(this))){{
v16=this.TRUE;
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
} else {{
v19=this.FALSE;
}
}}
}if(v19){{
v16=this.TRUE;
if((id(p14)>id(this))){{
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
}if((id(p14)<id(this))){{
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}}
}}
}for(Entry<?,?> ev4:v4.entrySet()){
String i25=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i26=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
v19=funCheckIfNodeInRange(v17, i26);
if(v19){{
setArrayIndex('=',v18,Arrays.asList(i25),i26,null,0);
}
}}

}
}
}}
}List<simulator.Node> v27 = new ArrayList<simulator.Node>();
int v28 = 0;
v28=(-1);
for(Entry<?,?> ev4:v4.entrySet()){
String i29=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i30=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((getArrayIndex(v18,null,i29)==null)){{
v28=v28+1;
setArrayIndex('=',v27,Arrays.asList(v28),i30,null,1);
}
}}

}
clearArray(v4,true);
for(Entry<?,?> ev18:v18.entrySet()){
String i31=(String) (ev18.getKey() instanceof Edge ? ((Edge)ev18.getKey()).node : ev18.getKey());
simulator.Node i32=(simulator.Node) (ev18.getValue() instanceof Edge ? ((Edge)ev18.getValue()).node : ev18.getValue());
{
updateVisualization(v4,i32,true,"black",0,i31);
}

}
for(simulator.Node i33:createIterable(v27)){{
funforwardNode_old(i33);}
}if((!v16)){{
funforwardNode_old(p14);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p34) { callCounterentry++; try {
funlinearize(p34);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p35) { callCounterinteger++; try {
if((p35==null?"1"==null:p35.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p36, simulator.Node p37) { callCountercheckIfNodeOnLevel++; try {
int v38 = 0;
v38=funlongestCommonPrefix(v2, funbitfolge(id(p37)));
if((v38>=p36)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p39) { callCounterbitfolge++; try {
int v40 = 97;
int v41 = (((p39*37)+17)%v40);
int v42 = 0;
String v43 = "";
int v44 = 0;
for(v44=0;(v44<v1);v44=v44+1){{
v42=(v41%2);
if((v42==1)){{
v43=("1"+v43);
}
} else {{
v43=("0"+v43);
}
}v41=(v41/2);
}
}{if(this.TRUE)return v43;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p45) { callCounterminPred++; try {
simulator.Node v46 = null;
simulator.Node v47 = null;
v46=(getArrayIndex(v3,null,(p45+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p45+"_pred0")))).node:null);
v47=(getArrayIndex(v3,null,(p45+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p45+"_pred1")))).node:null);
simulator.Node v48 = null;
if((id(v46)<id(v47))){{
v48=v46;
}
} else {{
v48=v47;
}
}{if(this.TRUE)return v48;}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v49 = 0;
simulator.Node v50 = null;
v50=funminPred(0);
for(v49=1;(v49<v1);v49=v49+1){{
if((id(v50)>id(funminPred(v49)))){{
v50=funminPred(v49);
}
}}
}{if(this.TRUE)return v50;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p51) { callCountermaxSucc++; try {
simulator.Node v52 = null;
simulator.Node v53 = null;
v52=(getArrayIndex(v3,null,(p51+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p51+"_succ0")))).node:null);
v53=(getArrayIndex(v3,null,(p51+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p51+"_succ1")))).node:null);
simulator.Node v54 = null;
if((id(v52)>id(v53))){{
v54=v52;
}
} else {{
v54=v53;
}
}{if(this.TRUE)return v54;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v55 = 0;
simulator.Node v56 = null;
v56=funmaxSucc(0);
for(v55=1;(v55<v1);v55=v55+1){{
if((id(v56)<id(funmaxSucc(v55)))){{
v56=funmaxSucc(v55);
}
}}
}{if(this.TRUE)return v56;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p57, String p58) { callCounterlongestCommonPrefix++; try {
int v59 = 0;
int v60 = 0;
v60=0;
for(v59=0;(v59<v1);v59=v59+1){{
if((sub_str(p57, v59, (v59+1))==null?sub_str(p58, v59, (v59+1))==null:sub_str(p57, v59, (v59+1)).equals(sub_str(p58, v59, (v59+1))))){{
v60=v60+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v60;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p61) { callCountergetLongestCommonPrefixNode++; try {
int v62 = 0;
simulator.Node v63 = null;
v62=(-1);
v63=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i64=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i65=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p61==null?i64==null:p61.equals(i64))){{
int v66 = 0;
v66=funlongestCommonPrefix(p61, i64);
if((v66>v62)){{
v62=v66;
v63=i65;
}
}}
}}

}
{if(this.TRUE)return v63;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p67, simulator.Node p68) { callCounterCheckIfNodeInRange++; try {
simulator.Node v69 = funminPred(p67);
simulator.Node v70 = funmaxSucc(p67);
boolean v71 = false;
v71=this.FALSE;
if(((v69!=null)&&(v70!=null))){{
boolean v72 = false;
v72=this.FALSE;
boolean v73 = false;
v73=this.FALSE;
if((id(p68)>=id(v70))){{
v72=this.TRUE;
}
}if((id(p68)<=id(v69))){{
v73=this.TRUE;
}
}v71=(!(v72||v73));
}
} else {if(((v69==null)&&(v70==null))){{
v71=this.TRUE;
}
} else {if((((v69==null)&&(v70!=null))&&(id(p68)<id(v70)))){{
v71=this.TRUE;
}
} else {if((((v69!=null)&&(v70==null))&&(id(p68)>id(v69)))){{
v71=this.TRUE;
}
}}}}{if(this.TRUE)return v71;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode_old;
protected void funforwardNode_old(simulator.Node p74) { callCounterforwardNode_old++; try {
simulator.Node v75 = null;
String v76 = "";
v76=funbitfolge(id(p74));
v75=fungetLongestCommonPrefixNode(v76);
if((v75!=null)){{
{if (v75!=null) v75.send("linearize",false,p74);}
}
} else {{
print("Neiiiin");{if (this!=null) this.send("linearize",false,p74);}
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode_old: "+e.getMessage()); } return ;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p77) { callCounterforwardNode++; try {
simulator.Node v78 = null;
if((id(p77)<id(this))){{
v78=funglobalMinPred();
{if (v78!=null) v78.send("linearize",false,p77);}
}
} else {if((id(p77)>id(this))){{
v78=funglobalMaxSucc();
{if (v78!=null) v78.send("linearize",false,p77);}
}
} else {{
}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p79) { callCountersortedLeftNeighbors++; try {
List<simulator.Node> v80 = new ArrayList<simulator.Node>();
int v81 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i82=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i83=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p79, i83)&&(id(i83)<id(this)))){{
updateVisualization(v5,i83,true,"black",1,v81);
v81=(v81+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p84) { callCountersortedRightNeighbors++; try {
List<simulator.Node> v85 = new ArrayList<simulator.Node>();
int v86 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i87=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i88=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p84, i88)&&(id(i88)>id(this)))){{
updateVisualization(v5,i88,true,"black",1,v86);
v86=(v86+1);
}
}}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v89 = 0;
v89=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));
int v90 = 0;
int v91 = 0;
simulator.Node v92 = null;
for(v90=0;(v90<(v89-1));v90=v90+1){{
for(v91=0;(v91<((v89-v90)-1));v91=v91+1){{
if((id((getArrayIndex(v5,null,v91)!=null?((Edge)(getArrayIndex(v5,null,v91))).node:null))>id((getArrayIndex(v5,null,(v91+1))!=null?((Edge)(getArrayIndex(v5,null,(v91+1)))).node:null)))){{
v92=(getArrayIndex(v5,null,v91)!=null?((Edge)(getArrayIndex(v5,null,v91))).node:null);
updateVisualization(v5,(getArrayIndex(v5,null,(v91+1))!=null?((Edge)(getArrayIndex(v5,null,(v91+1)))).node:null),true,"black",1,v91);
updateVisualization(v5,v92,true,"black",1,(v91+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
