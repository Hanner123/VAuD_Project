// skip+
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
print(("Meine ID ist "+id(this)));print(("Meine Bitfolge ist "+v2));print(("erstes Bit: "+sub_str(v2, 0, 1)));int v6 = 0;
for(v6=0;(v6<v1);v6=v6+1){{
updateVisualization(v3,null,true,"black",0,(v6+"_succ0"));
updateVisualization(v3,null,true,"black",0,(v6+"_succ1"));
updateVisualization(v3,null,true,"black",0,(v6+"_pred0"));
updateVisualization(v3,null,true,"black",0,(v6+"_pred1"));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
print("timeout");List<simulator.Node> v7 = new ArrayList<simulator.Node>();
List<simulator.Node> v8 = new ArrayList<simulator.Node>();
print(length(copyEdgeArrayToNodeArray(v4,1)));clearArray(v5,true);
int v9 = 0;
for(v9=0;(v9<v1);v9=v9+1){{
funsortedLeftNeighbors(v9);print("Laenge:");print(length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));int v10 = 0;
for(v10=0;(v10<(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1));v10=v10+1){{
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v10+1))!=null?((Edge)(getArrayIndex(v5,null,(v10+1)))).node:null));}
}
}{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,this);}
setArrayIndex('=',v7,Arrays.asList(v9),(getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null),null,1);
clearArray(v5,true);
funsortedRightNeighbors(v9);int v11 = 0;
for(v11=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));(v11>1);v11=v11-1){{
{if ((getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null)!=null) (getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v11-1))!=null?((Edge)(getArrayIndex(v5,null,(v11-1)))).node:null));}
}
}{if ((getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null)!=null) (getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null).send("linearize",false,this);}
setArrayIndex('=',v8,Arrays.asList(v9),(getArrayIndex(v5,null,v11)!=null?((Edge)(getArrayIndex(v5,null,v11))).node:null),null,1);
}
}for(v9=0;(v9<v1);v9=v9+1){{
clearArray(v5,true);
funsortedLeftNeighbors(v9);int v12 = 0;
for(v12=0;(v12<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v12=v12+1){{
{if ((getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null)!=null) (getArrayIndex(v5,null,v12)!=null?((Edge)(getArrayIndex(v5,null,v12))).node:null).send("linearize",false,getArrayIndex(v8,null,v9));}
}
}clearArray(v5,true);
funsortedRightNeighbors(v9);int v13 = 0;
for(v13=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));(v13>0);v13=v13-1){{
{if ((getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null)!=null) (getArrayIndex(v5,null,v13)!=null?((Edge)(getArrayIndex(v5,null,v13))).node:null).send("linearize",false,getArrayIndex(v7,null,v9));}
}
}clearArray(v5,true);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p14) { callCounterlinearize++; try {
print("linearize");print(id(p14));String v15 = "";
v15=funbitfolge(id(p14));
boolean v16 = false;
v16=this.FALSE;
int v17 = 0;
HashMap<String, simulator.Node> v18 = new HashMap<String, simulator.Node>();
for(v17=0;(v17<v1);v17=v17+1){{
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
print("pred_0 is null, v wird pred_0");updateVisualization(v3,p14,true,"black",0,(v17+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v21&&(!v24))&&(id(p14)<id(this)))){{
print("pred_1 is null, v wird pred_1");updateVisualization(v3,p14,true,"black",0,(v17+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v22&&v24)&&(id(p14)>id(this)))){{
print("succ_0 is null, v wird succ_0");updateVisualization(v3,p14,true,"black",0,(v17+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}if(((v23&&(!v24))&&(id(p14)>id(this)))){{
print("!!!!succ_1 is null, v wird succ_1!!!!");print(("Bit after prefix is: "+funinteger(sub_str(v15, v17, (v17+1)))));updateVisualization(v3,p14,true,"black",0,(v17+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
}
}v19=funCheckIfNodeInRange(v17, p14);
print(("In Range: "+v19));if((funminPred(v17)==null)){{
print("min pred is null");if((id(p14)<id(this))){{
v16=this.TRUE;
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred1"));
updateVisualization(v4,p14,true,"black",0,v15);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_pred0"));
updateVisualization(v4,p14,true,"black",0,v15);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
}print("pred aktualisieren");}
} else {{
v19=this.FALSE;
}
}}
}if((funmaxSucc(v17)==null)){{
print("max succ is null");if((id(p14)>id(this))){{
v16=this.TRUE;
if((funinteger(sub_str(v15, v17, (v17+1)))==1)){{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ1"));
updateVisualization(v4,p14,true,"black",0,v15);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
} else {{
updateVisualization(v3,p14,true,"black",0,(v17+"_succ0"));
updateVisualization(v4,p14,true,"black",0,v15);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
}print("succ aktualisieren");}
} else {{
v19=this.FALSE;
}
}}
}if(v19){{
v16=this.TRUE;
print("else - ranges und nachbarschaften aktualisieren (succ, pred und nachbarschaftsliste))");if((id(p14)>id(this))){{
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
}for(Entry<?,?> ev4:v4.entrySet()){
String i27=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i28=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((getArrayIndex(v18,null,i27)==null)){{
funforwardNode(i28);}
}}

}
clearArray(v4,true);
for(Entry<?,?> ev18:v18.entrySet()){
String i29=(String) (ev18.getKey() instanceof Edge ? ((Edge)ev18.getKey()).node : ev18.getKey());
simulator.Node i30=(simulator.Node) (ev18.getValue() instanceof Edge ? ((Edge)ev18.getValue()).node : ev18.getValue());
{
updateVisualization(v4,i30,true,"black",0,i29);
}

}
if((!v16)){{
funforwardNode(p14);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p31) { callCounterentry++; try {
print("Entry: linearize");print(id(p31));funlinearize(p31);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p32) { callCounterinteger++; try {
if((p32==null?"1"==null:p32.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCountercheckIfNodeOnLevel;
protected boolean funcheckIfNodeOnLevel(int p33, simulator.Node p34) { callCountercheckIfNodeOnLevel++; try {
int v35 = 0;
v35=funlongestCommonPrefix(v2, funbitfolge(id(p34)));
if((v35>=p33)){{
{if(this.TRUE)return this.TRUE;}}
} else {{
{if(this.TRUE)return this.FALSE;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in checkIfNodeOnLevel: "+e.getMessage()); } return false;} long callCounterbitfolge;
protected String funbitfolge(int p36) { callCounterbitfolge++; try {
int v37 = 97;
int v38 = (((p36*37)+17)%v37);
int v39 = 0;
String v40 = "";
int v41 = 0;
for(v41=0;(v41<v1);v41=v41+1){{
v39=(v38%2);
if((v39==1)){{
v40=("1"+v40);
}
} else {{
v40=("0"+v40);
}
}v38=(v38/2);
}
}{if(this.TRUE)return v40;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p42) { callCounterminPred++; try {
simulator.Node v43 = null;
simulator.Node v44 = null;
v43=(getArrayIndex(v3,null,(p42+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p42+"_pred0")))).node:null);
v44=(getArrayIndex(v3,null,(p42+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p42+"_pred1")))).node:null);
simulator.Node v45 = null;
if((id(v43)<id(v44))){{
v45=v43;
}
} else {{
v45=v44;
}
}print(("min pred"+id(v45)));{if(this.TRUE)return v45;}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCounterglobalMinPred;
protected simulator.Node funglobalMinPred() { callCounterglobalMinPred++; try {
int v46 = 0;
simulator.Node v47 = null;
v47=funminPred(0);
for(v46=1;(v46<v1);v46=v46+1){{
if((id(v47)>id(funminPred(v46)))){{
v47=funminPred(v46);
}
}}
}{if(this.TRUE)return v47;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMinPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p48) { callCountermaxSucc++; try {
simulator.Node v49 = null;
simulator.Node v50 = null;
v49=(getArrayIndex(v3,null,(p48+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p48+"_succ0")))).node:null);
v50=(getArrayIndex(v3,null,(p48+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p48+"_succ1")))).node:null);
simulator.Node v51 = null;
if((id(v49)>id(v50))){{
v51=v49;
}
} else {{
v51=v50;
}
}print(("max succ"+id(v51)));{if(this.TRUE)return v51;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterglobalMaxSucc;
protected simulator.Node funglobalMaxSucc() { callCounterglobalMaxSucc++; try {
int v52 = 0;
simulator.Node v53 = null;
v53=funmaxSucc(0);
for(v52=1;(v52<v1);v52=v52+1){{
if((id(v53)<id(funmaxSucc(v52)))){{
v53=funmaxSucc(v52);
}
}}
}{if(this.TRUE)return v53;}}
 catch (ArithmeticException e){ print("arithmetic exception in globalMaxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p54, String p55) { callCounterlongestCommonPrefix++; try {
int v56 = 0;
int v57 = 0;
v57=0;
print(v1);for(v56=0;(v56<v1);v56=v56+1){{
if((sub_str(p54, v56, (v56+1))==null?sub_str(p55, v56, (v56+1))==null:sub_str(p54, v56, (v56+1)).equals(sub_str(p55, v56, (v56+1))))){{
v57=v57+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v57;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p58) { callCountergetLongestCommonPrefixNode++; try {
int v59 = 0;
simulator.Node v60 = null;
v59=(-1);
v60=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i61=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i62=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p58==null?i61==null:p58.equals(i61))){{
int v63 = 0;
v63=funlongestCommonPrefix(p58, i61);
if((v63>v59)){{
v59=v63;
v60=i62;
}
}}
}}

}
{if(this.TRUE)return v60;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p64, simulator.Node p65) { callCounterCheckIfNodeInRange++; try {
simulator.Node v66 = funminPred(p64);
simulator.Node v67 = funmaxSucc(p64);
boolean v68 = false;
v68=this.FALSE;
if(((v66!=null)&&(v67!=null))){{
boolean v69 = false;
v69=this.FALSE;
boolean v70 = false;
v70=this.FALSE;
if((id(p65)>=id(v67))){{
v69=this.TRUE;
}
}if((id(p65)<=id(v66))){{
v70=this.TRUE;
}
}v68=(!(v69||v70));
}
} else {if(((v66==null)&&(v67==null))){{
v68=this.TRUE;
}
} else {if((((v66==null)&&(v67!=null))&&(id(p65)<id(v67)))){{
v68=this.TRUE;
}
} else {if((((v66!=null)&&(v67==null))&&(id(p65)>id(v66)))){{
v68=this.TRUE;
}
}}}}{if(this.TRUE)return v68;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode_old;
protected void funforwardNode_old(simulator.Node p71) { callCounterforwardNode_old++; try {
simulator.Node v72 = null;
String v73 = "";
v73=funbitfolge(id(p71));
v72=fungetLongestCommonPrefixNode(v73);
if((v72!=null)){{
{if (v72!=null) v72.send("linearize",false,p71);}
}
} else {{
print("Neiiiin");}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode_old: "+e.getMessage()); } return ;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p74) { callCounterforwardNode++; try {
simulator.Node v75 = null;
if((id(p74)<id(this))){{
v75=funglobalMinPred();
{if (v75!=null) v75.send("linearize",false,p74);}
}
} else {if((id(p74)>id(this))){{
v75=funglobalMaxSucc();
{if (v75!=null) v75.send("linearize",false,p74);}
}
} else {{
print("gleicher Node???");}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors(int p76) { callCountersortedLeftNeighbors++; try {
List<simulator.Node> v77 = new ArrayList<simulator.Node>();
int v78 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i79=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i80=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p76, i80)&&(id(i80)<id(this)))){{
updateVisualization(v5,i80,true,"black",1,v78);
}
}v78=(v78+1);
}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors(int p81) { callCountersortedRightNeighbors++; try {
List<simulator.Node> v82 = new ArrayList<simulator.Node>();
int v83 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i84=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i85=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((funcheckIfNodeOnLevel(p81, i85)&&(id(i85)>id(this)))){{
updateVisualization(v5,i85,true,"black",1,v83);
}
}v83=(v83+1);
}

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
