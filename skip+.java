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
attr.add(new SimpleEntry<String, Entry<String, String>[]>("bitfolge",new SimpleEntry[] {
new SimpleEntry<String, String>("x", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("minPred",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("maxSucc",new SimpleEntry[] {
new SimpleEntry<String, String>("level", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("longestCommonPrefix",new SimpleEntry[] {
new SimpleEntry<String, String>("bit1", "String"), 
new SimpleEntry<String, String>("bit2", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("getLongestCommonPrefixNode",new SimpleEntry[] {
new SimpleEntry<String, String>("wBit", "String")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("CheckIfNodeInRange",new SimpleEntry[] {
new SimpleEntry<String, String>("currentLevel", "int"), 
new SimpleEntry<String, String>("v", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("forwardNode",new SimpleEntry[] {
new SimpleEntry<String, String>("forwardedNode", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedLeftNeighbors",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("sortedRightNeighbors",new SimpleEntry[] {}));
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
attr.add(new SimpleEntry<String, Long>("bitfolge",callCounterbitfolge));
attr.add(new SimpleEntry<String, Long>("minPred",callCounterminPred));
attr.add(new SimpleEntry<String, Long>("maxSucc",callCountermaxSucc));
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
if (params[0].equals("integer")){
Object result = funinteger((String)params[2]);
if ((boolean)params[1]){
print("integer returns " + result);
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
if (params[0].equals("maxSucc")){
Object result = funmaxSucc((int)params[2]);
if ((boolean)params[1]){
print("maxSucc returns " + result);
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
funsortedLeftNeighbors();if ((boolean)params[1]){
print("sortedLeftNeighbors returned");
}
}
if (params[0].equals("sortedRightNeighbors")){
funsortedRightNeighbors();if ((boolean)params[1]){
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
print("timeout");simulator.Node v7 = null;
simulator.Node v8 = null;
print(length(copyEdgeArrayToNodeArray(v4,1)));clearArray(v5,true);
funsortedLeftNeighbors();print("Laenge:");print(length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));int v9 = 0;
for(v9=0;(v9<(length((List<Node>)copyEdgeArrayToNodeArray(v5,1))-1));v9=v9+1){{
{if ((getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null)!=null) (getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v9+1))!=null?((Edge)(getArrayIndex(v5,null,(v9+1)))).node:null));}
}
}{if ((getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null)!=null) (getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null).send("linearize",false,this);}
v7=(getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null);
clearArray(v5,true);
funsortedRightNeighbors();int v10 = 0;
for(v10=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));(v10>1);v10=v10-1){{
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,(getArrayIndex(v5,null,(v10-1))!=null?((Edge)(getArrayIndex(v5,null,(v10-1)))).node:null));}
}
}{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,this);}
v8=(getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null);
clearArray(v5,true);
funsortedLeftNeighbors();for(v9=0;(v9<length((List<Node>)copyEdgeArrayToNodeArray(v5,1)));v9=v9+1){{
{if ((getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null)!=null) (getArrayIndex(v5,null,v9)!=null?((Edge)(getArrayIndex(v5,null,v9))).node:null).send("linearize",false,v8);}
}
}clearArray(v5,true);
funsortedRightNeighbors();for(v10=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));(v10>0);v10=v10-1){{
{if ((getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null)!=null) (getArrayIndex(v5,null,v10)!=null?((Edge)(getArrayIndex(v5,null,v10))).node:null).send("linearize",false,v7);}
}
}clearArray(v5,true);
}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p11) { callCounterlinearize++; try {
print("linearize");print(id(p11));String v12 = "";
v12=funbitfolge(id(p11));
boolean v13 = false;
v13=this.FALSE;
int v14 = 0;
HashMap<String, simulator.Node> v15 = new HashMap<String, simulator.Node>();
for(v14=0;(v14<v1);v14=v14+1){{
boolean v16 = false;
v16=funCheckIfNodeInRange(v14, p11);
print(("In Range: "+v16));if((funminPred(v14)==null)){{
print("min pred is null");if((id(p11)<id(this))){{
v13=this.TRUE;
if((funinteger(sub_str(v12, (v14+1), (v14+2)))==1)){{
updateVisualization(v3,p11,true,"black",0,(v14+"_pred1"));
updateVisualization(v4,p11,true,"black",0,v12);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
} else {{
updateVisualization(v3,p11,true,"black",0,(v14+"_pred0"));
updateVisualization(v4,p11,true,"black",0,v12);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
}print("pred aktualisieren");}
} else {{
v16=this.FALSE;
}
}}
}if((funmaxSucc(v14)==null)){{
print("max succ is null");if((id(p11)>id(this))){{
v13=this.TRUE;
if((funinteger(sub_str(v12, (v14+1), (v14+2)))==1)){{
updateVisualization(v3,p11,true,"black",0,(v14+"_succ1"));
updateVisualization(v4,p11,true,"black",0,v12);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
} else {{
updateVisualization(v3,p11,true,"black",0,(v14+"_succ0"));
updateVisualization(v4,p11,true,"black",0,v12);
print(length(copyEdgeArrayToNodeArray(v4,1)));}
}print("succ aktualisieren");}
} else {{
v16=this.FALSE;
}
}}
}if(v16){{
v13=this.TRUE;
print("else - ranges und nachbarschaften aktualisieren (succ, pred und nachbarschaftsliste))");if((id(p11)>id(this))){{
if((funinteger(sub_str(v12, (v14+1), (v14+2)))==1)){{
updateVisualization(v3,p11,true,"black",0,(v14+"_succ1"));
updateVisualization(v4,p11,true,"black",0,v12);
}
} else {{
updateVisualization(v3,p11,true,"black",0,(v14+"_succ0"));
updateVisualization(v4,p11,true,"black",0,v12);
}
}}
}if((id(p11)<id(this))){{
if((funinteger(sub_str(v12, (v14+1), (v14+2)))==1)){{
updateVisualization(v3,p11,true,"black",0,(v14+"_pred1"));
updateVisualization(v4,p11,true,"black",0,v12);
}
} else {{
updateVisualization(v3,p11,true,"black",0,(v14+"_pred0"));
updateVisualization(v4,p11,true,"black",0,v12);
}
}}
}}
}for(Entry<?,?> ev4:v4.entrySet()){
String i17=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i18=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
v16=funCheckIfNodeInRange(v14, i18);
if(v16){{
setArrayIndex('=',v15,Arrays.asList(i17),i18,null,0);
}
}}

}
}
}for(Entry<?,?> ev4:v4.entrySet()){
String i19=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i20=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((getArrayIndex(v15,null,i19)==null)){{
funforwardNode(i20);}
}}

}
clearArray(v4,true);
for(Entry<?,?> ev15:v15.entrySet()){
String i21=(String) (ev15.getKey() instanceof Edge ? ((Edge)ev15.getKey()).node : ev15.getKey());
simulator.Node i22=(simulator.Node) (ev15.getValue() instanceof Edge ? ((Edge)ev15.getValue()).node : ev15.getValue());
{
updateVisualization(v4,i22,true,"black",0,i21);
}

}
if((!v13)){{
funforwardNode(p11);}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p23) { callCounterentry++; try {
print("Entry: linearize");print(id(p23));funlinearize(p23);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p24) { callCounterinteger++; try {
if((p24==null?"1"==null:p24.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCounterbitfolge;
protected String funbitfolge(int p25) { callCounterbitfolge++; try {
int v26 = 97;
int v27 = (((p25*37)+17)%v26);
int v28 = 0;
String v29 = "";
int v30 = 0;
for(v30=0;(v30<v1);v30=v30+1){{
v28=(v27%2);
if((v28==1)){{
v29=("1"+v29);
}
} else {{
v29=("0"+v29);
}
}}
}{if(this.TRUE)return v29;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p31) { callCounterminPred++; try {
simulator.Node v32 = null;
simulator.Node v33 = null;
v32=(getArrayIndex(v3,null,(p31+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p31+"_pred0")))).node:null);
v33=(getArrayIndex(v3,null,(p31+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p31+"_pred1")))).node:null);
simulator.Node v34 = null;
if((id(v32)<id(v33))){{
v34=v32;
}
} else {{
v34=v33;
}
}print(("min pred"+id(v34)));{if(this.TRUE)return v34;}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p35) { callCountermaxSucc++; try {
simulator.Node v36 = null;
simulator.Node v37 = null;
v36=(getArrayIndex(v3,null,(p35+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p35+"_succ0")))).node:null);
v37=(getArrayIndex(v3,null,(p35+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p35+"_succ1")))).node:null);
simulator.Node v38 = null;
if((id(v36)>id(v37))){{
v38=v36;
}
} else {{
v38=v37;
}
}print(("max succ"+id(v38)));{if(this.TRUE)return v38;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p39, String p40) { callCounterlongestCommonPrefix++; try {
int v41 = 0;
int v42 = 0;
v42=0;
print(v1);for(v41=0;(v41<v1);v41=v41+1){{
if((sub_str(p39, v41, (v41+1))==null?sub_str(p40, v41, (v41+1))==null:sub_str(p39, v41, (v41+1)).equals(sub_str(p40, v41, (v41+1))))){{
v42=v42+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v42;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p43) { callCountergetLongestCommonPrefixNode++; try {
int v44 = 0;
simulator.Node v45 = null;
v44=(-1);
v45=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i46=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i47=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p43==null?i46==null:p43.equals(i46))){{
int v48 = 0;
v48=funlongestCommonPrefix(p43, i46);
if((v48>v44)){{
v44=v48;
v45=i47;
}
}}
}}

}
{if(this.TRUE)return v45;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} long callCounterCheckIfNodeInRange;
protected boolean funCheckIfNodeInRange(int p49, simulator.Node p50) { callCounterCheckIfNodeInRange++; try {
simulator.Node v51 = funminPred(p49);
simulator.Node v52 = funmaxSucc(p49);
boolean v53 = false;
v53=this.FALSE;
if(((v51!=null)&&(v52!=null))){{
boolean v54 = false;
v54=this.FALSE;
boolean v55 = false;
v55=this.FALSE;
if((id(p50)>id(v52))){{
v54=this.TRUE;
}
}if((id(p50)<id(v51))){{
v55=this.TRUE;
}
}v53=(!(v54||v55));
}
} else {if(((v51==null)&&(v52==null))){{
v53=this.TRUE;
}
} else {if((((v51==null)&&(v52!=null))&&(id(p50)<id(v52)))){{
v53=this.TRUE;
}
} else {if((((v51!=null)&&(v52==null))&&(id(p50)>id(v51)))){{
v53=this.TRUE;
}
}}}}{if(this.TRUE)return v53;}}
 catch (ArithmeticException e){ print("arithmetic exception in CheckIfNodeInRange: "+e.getMessage()); } return false;} long callCounterforwardNode;
protected void funforwardNode(simulator.Node p56) { callCounterforwardNode++; try {
simulator.Node v57 = null;
String v58 = "";
v58=funbitfolge(id(p56));
v57=fungetLongestCommonPrefixNode(v58);
if((v57!=null)){{
{if (v57!=null) v57.send("linearize",false,p56);}
}
} else {{
print("Neiiiin");}
}}
 catch (ArithmeticException e){ print("arithmetic exception in forwardNode: "+e.getMessage()); } return ;} long callCountersortedLeftNeighbors;
protected void funsortedLeftNeighbors() { callCountersortedLeftNeighbors++; try {
List<simulator.Node> v59 = new ArrayList<simulator.Node>();
int v60 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i61=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i62=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((id(i62)<id(this))){{
updateVisualization(v5,i62,true,"black",1,v60);
}
}v60=(v60+1);
}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedLeftNeighbors: "+e.getMessage()); } return ;} long callCountersortedRightNeighbors;
protected void funsortedRightNeighbors() { callCountersortedRightNeighbors++; try {
List<simulator.Node> v63 = new ArrayList<simulator.Node>();
int v64 = 0;
clearArray(v5,true);
for(Entry<?,?> ev4:v4.entrySet()){
String i65=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i66=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if((id(i66)>id(this))){{
updateVisualization(v5,i66,true,"black",1,v64);
}
}v64=(v64+1);
}

}
funbubbleSort();{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in sortedRightNeighbors: "+e.getMessage()); } return ;} long callCounterbubbleSort;
protected void funbubbleSort() { callCounterbubbleSort++; try {
int v67 = 0;
v67=length((List<Node>)copyEdgeArrayToNodeArray(v5,1));
int v68 = 0;
int v69 = 0;
simulator.Node v70 = null;
for(v68=0;(v68<(v67-1));v68=v68+1){{
for(v69=0;(v69<((v67-v68)-1));v69=v69+1){{
if((id((getArrayIndex(v5,null,v69)!=null?((Edge)(getArrayIndex(v5,null,v69))).node:null))>id((getArrayIndex(v5,null,(v69+1))!=null?((Edge)(getArrayIndex(v5,null,(v69+1)))).node:null)))){{
v70=(getArrayIndex(v5,null,v69)!=null?((Edge)(getArrayIndex(v5,null,v69))).node:null);
updateVisualization(v5,(getArrayIndex(v5,null,(v69+1))!=null?((Edge)(getArrayIndex(v5,null,(v69+1)))).node:null),true,"black",1,v69);
updateVisualization(v5,v70,true,"black",1,(v69+1));
}
}}
}}
}{if(this.TRUE)return ;}}
 catch (ArithmeticException e){ print("arithmetic exception in bubbleSort: "+e.getMessage()); } return ;} }
