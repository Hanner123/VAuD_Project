// C:\Users\joshu\Repos\VAuD_Project\skip+
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
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("limit",v1), 
new SimpleEntry<String, Object>("bitString",v2), 
new SimpleEntry<String, Object>("succPredList",v3), 
new SimpleEntry<String, Object>("neighbors",v4)};}
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
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v2=funbitfolge(id(this));
int v5 = 0;
for(v5=0;(v5<v1);v5=v5+1){{
updateVisualization(v3,null,true,"black",0,(v5+"_succ0"));
updateVisualization(v3,null,true,"black",0,(v5+"_succ1"));
updateVisualization(v3,null,true,"black",0,(v5+"_pred0"));
updateVisualization(v3,null,true,"black",0,(v5+"_pred1"));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
print("timeout");}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p6) { callCounterlinearize++; try {
print("linearize");String v7 = "";
v7=funbitfolge(id(p6));
boolean v8 = false;
v8=this.FALSE;
int v9 = 0;
for(v9=0;(v9<v1);v9=v9+1){{
simulator.Node v10 = funminPred(v9);
simulator.Node v11 = funmaxSucc(v9);
boolean v12 = false;
if(((v10!=null)&&(v11!=null))){{
boolean v13 = false;
v13=this.FALSE;
boolean v14 = false;
v14=this.FALSE;
if((id(p6)>id(v11))){{
v13=this.TRUE;
}
}if((id(p6)<id(v10))){{
v14=this.TRUE;
}
}}
}if((v10==null)){{
if((id(p6)<id(this))){{
v8=this.TRUE;
if((funinteger(sub_str(v7, (v9+1), (v9+2)))==1)){{
updateVisualization(v3,p6,true,"black",0,(v9+"_pred1"));
updateVisualization(v4,p6,true,"black",0,v7);
}
} else {{
updateVisualization(v3,p6,true,"black",0,(v9+"_pred0"));
updateVisualization(v4,p6,true,"black",0,v7);
}
}}
} else {{
v12=this.FALSE;
}
}}
}if((v11==null)){{
if((id(p6)>id(this))){{
v8=this.TRUE;
if((funinteger(sub_str(v7, (v9+1), (v9+2)))==1)){{
updateVisualization(v3,p6,true,"black",0,(v9+"_succ1"));
updateVisualization(v4,p6,true,"black",0,v7);
}
} else {{
updateVisualization(v3,p6,true,"black",0,(v9+"_succ0"));
updateVisualization(v4,p6,true,"black",0,v7);
}
}}
} else {{
v12=this.FALSE;
}
}}
}if(v12){{
v8=this.TRUE;
print("else - ranges und nachbarschaften aktualisieren (succ, pred und nachbarschaftsliste))");if((id(p6)>id(this))){{
if((funinteger(sub_str(v7, (v9+1), (v9+2)))==1)){{
updateVisualization(v3,p6,true,"black",0,(v9+"_succ1"));
updateVisualization(v4,p6,true,"black",0,v7);
}
} else {{
updateVisualization(v3,p6,true,"black",0,(v9+"_succ0"));
updateVisualization(v4,p6,true,"black",0,v7);
}
}}
}if((id(p6)<id(this))){{
if((funinteger(sub_str(v7, (v9+1), (v9+2)))==1)){{
updateVisualization(v3,p6,true,"black",0,(v9+"_pred1"));
updateVisualization(v4,p6,true,"black",0,v7);
}
} else {{
updateVisualization(v3,p6,true,"black",0,(v9+"_pred0"));
updateVisualization(v4,p6,true,"black",0,v7);
}
}}
}}
}}
}if((!v8)){{
simulator.Node v15 = null;
v15=fungetLongestCommonPrefixNode(v7);
if((v15!=null)){{
{if (v15!=null) v15.send("linearize",false,p6);}
}
} else {{
}
}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} long callCounterentry;
protected void funentry(simulator.Node p16) { callCounterentry++; try {
funlinearize(p16);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCounterinteger;
protected int funinteger(String p17) { callCounterinteger++; try {
if((p17==null?"1"==null:p17.equals("1"))){{
{if(this.TRUE)return 1;}}
} else {{
{if(this.TRUE)return 0;}}
}}
 catch (ArithmeticException e){ print("arithmetic exception in integer: "+e.getMessage()); } return 0;} long callCounterbitfolge;
protected String funbitfolge(int p18) { callCounterbitfolge++; try {
int v19 = 97;
int v20 = (((p18*37)+17)%v19);
int v21 = 0;
String v22 = "";
int v23 = 0;
for(v23=0;(v23<v1);v23=v23+1){{
v21=(v20%2);
if((v21==1)){{
v22=("1"+v22);
}
} else {{
v22=("0"+v22);
}
}}
}{if(this.TRUE)return v22;}}
 catch (ArithmeticException e){ print("arithmetic exception in bitfolge: "+e.getMessage()); } return "";} long callCounterminPred;
protected simulator.Node funminPred(int p24) { callCounterminPred++; try {
simulator.Node v25 = null;
simulator.Node v26 = null;
v25=(getArrayIndex(v3,null,(p24+"_pred0"))!=null?((Edge)(getArrayIndex(v3,null,(p24+"_pred0")))).node:null);
v26=(getArrayIndex(v3,null,(p24+"_pred1"))!=null?((Edge)(getArrayIndex(v3,null,(p24+"_pred1")))).node:null);
simulator.Node v27 = null;
if((id(v25)<id(v26))){{
v27=v25;
}
} else {{
v27=v26;
}
}print(("min pred"+id(v27)));{if(this.TRUE)return v27;}}
 catch (ArithmeticException e){ print("arithmetic exception in minPred: "+e.getMessage()); } return null;} long callCountermaxSucc;
protected simulator.Node funmaxSucc(int p28) { callCountermaxSucc++; try {
simulator.Node v29 = null;
simulator.Node v30 = null;
v29=(getArrayIndex(v3,null,(p28+"_succ0"))!=null?((Edge)(getArrayIndex(v3,null,(p28+"_succ0")))).node:null);
v30=(getArrayIndex(v3,null,(p28+"_succ1"))!=null?((Edge)(getArrayIndex(v3,null,(p28+"_succ1")))).node:null);
simulator.Node v31 = null;
if((id(v29)>id(v30))){{
v31=v29;
}
} else {{
v31=v30;
}
}print(("max succ"+id(v31)));{if(this.TRUE)return v31;}}
 catch (ArithmeticException e){ print("arithmetic exception in maxSucc: "+e.getMessage()); } return null;} long callCounterlongestCommonPrefix;
protected int funlongestCommonPrefix(String p32, String p33) { callCounterlongestCommonPrefix++; try {
int v34 = 0;
int v35 = 0;
v35=0;
print(v1);for(v34=0;(v34<v1);v34=v34+1){{
if((sub_str(p32, v34, (v34+1))==null?sub_str(p33, v34, (v34+1))==null:sub_str(p32, v34, (v34+1)).equals(sub_str(p33, v34, (v34+1))))){{
v35=v35+1;
}
} else {{
{if(this.TRUE)break;}}
}}
}{if(this.TRUE)return v35;}}
 catch (ArithmeticException e){ print("arithmetic exception in longestCommonPrefix: "+e.getMessage()); } return 0;} long callCountergetLongestCommonPrefixNode;
protected simulator.Node fungetLongestCommonPrefixNode(String p36) { callCountergetLongestCommonPrefixNode++; try {
int v37 = 0;
simulator.Node v38 = null;
v37=(-1);
v38=null;
for(Entry<?,?> ev4:v4.entrySet()){
String i39=(String) (ev4.getKey() instanceof Edge ? ((Edge)ev4.getKey()).node : ev4.getKey());
simulator.Node i40=(simulator.Node) (ev4.getValue() instanceof Edge ? ((Edge)ev4.getValue()).node : ev4.getValue());
{
if(!(p36==null?i39==null:p36.equals(i39))){{
int v41 = 0;
v41=funlongestCommonPrefix(p36, i39);
if((v41>v37)){{
v37=v41;
v38=i40;
}
}}
}}

}
{if(this.TRUE)return v38;}}
 catch (ArithmeticException e){ print("arithmetic exception in getLongestCommonPrefixNode: "+e.getMessage()); } return null;} }
