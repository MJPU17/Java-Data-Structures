
public class AplMain {
	
	static void linkedList(){
	    MyLinkedList<Integer> list=new MyLinkedList<>();
	    for(int i=100;i<=120;i++){
	        list.addLast(i);
	    }
	    for(int aux: list){
	        System.out.printf("%d ",aux);
	    }
	    list.remove(0);
	    System.out.print("\n");
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	    list.remove(list.getSize()-1);
	    System.out.print("\n");
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	    list.remove(5);
	    list.remove(0);
	    list.remove(2);
	    System.out.print("\n");
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	    while(!list.isEmpty()){
	        list.remove(0);
	    }
	    for(int i=200;i<=222;i++){
	        list.addLast(i);
	    }
	    System.out.print("\n");
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	    list.clear();
	    System.out.printf("\nSize: %d\n",list.getSize());
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	    for(int i=223;i<=244;i++){
	        list.addLast(i);
	    }
	    list.set(2,1234);
	    list.set(0,1345);
	    list.set(list.getSize()-1,2367);
	    System.out.printf("\nSize: %d\n",list.getSize());
	    for(int aux: list){
	    	System.out.printf("%d ",aux);
	    }
	}
	
	static void doubleLinkedList(){
	    MyDoubleLinkedList<Integer> dlist=new MyDoubleLinkedList<>();
	    for(int i=0;i<5;i++){
	        dlist.add(i);
	    }
	    for(int i=0;i<dlist.getSize();i++){
	    	System.out.printf("%d ",dlist.get(i));
	    }
	    System.out.printf("\n");
	    dlist.remove(3);
	    for(int i=0;i<dlist.getSize();i++){
	    	System.out.printf("%d ",dlist.get(i));
	    }
	    System.out.printf("\n");
	    dlist.remove(3);
	    for(int i=0;i<dlist.getSize();i++){
	    	System.out.printf("%d ",dlist.get(i));
	    }
	    System.out.printf("\n");
	    dlist.add(1,100);
	    for(int i=0;i<dlist.getSize();i++){
	    	System.out.printf("%d ",dlist.get(i));
	    }
	    System.out.printf("\n");
	    dlist.addInit(345);
	    for(int i=0;i<dlist.getSize();i++){
	    	System.out.printf("%d ",dlist.get(i));
	    }
	    dlist.remove(0);
	    System.out.printf("\n");
	    for(int aux: dlist){
	    	System.out.printf("%d ",aux);
	    }
	    dlist.remove(dlist.getSize()-1);
	    System.out.printf("\n");
	    for(int aux: dlist){
	    	System.out.printf("%d ",aux);
	    }
	    while(!dlist.isEmpty()){
	        dlist.remove(0);
	    }
	    for(int i=90;i<=120;i++){
	        dlist.add(i);
	    }
	    System.out.printf("\n");
	    for(int aux: dlist){
	    	System.out.printf("%d ",aux);
	    }
	    dlist.clear();
	    System.out.printf("\nSize: %d\n",dlist.getSize());
	    for(int aux: dlist){
	    	System.out.printf("%d ",aux);
	    }
	    for(int i=121;i<=140;i++){
	        dlist.add(i);
	    }
	    dlist.set(2,1234);
	    dlist.set(0,1345);
	    dlist.set(dlist.getSize()-1,2367);
	    System.out.printf("\nSize: %d\n",dlist.getSize());
	    for(int aux: dlist){
	    	System.out.printf("%d ",aux);
	    }
	}
	
	static void dequeList(){
	    DequeList<Integer> dqlist=new DequeList<>();
	    for(int i=1;i<=10;i++){
	    	if(i%2==0)dqlist.insertFirst(i);
	    	else dqlist.insertLast(i);
	    }
	    for(int i=0;i<dqlist.getSize();i++){
	    	System.out.printf("%d ",dqlist.get(i));
	    }
	    System.out.printf("\n");
	    dqlist.removeFirst();
	    dqlist.removeLast();
	    for(int i=0;i<dqlist.getSize();i++){
	    	System.out.printf("%d ",dqlist.get(i));
	    }
	    System.out.printf("\n");
	    dqlist.removeFirst();
	    dqlist.removeLast();
	    for(int i=0;i<dqlist.getSize();i++){
	    	System.out.printf("%d ",dqlist.get(i));
	    }
	    System.out.printf("\n%d\n",dqlist.getTail().getInfo());
	    while(!dqlist.isEmpty()){
	    	System.out.printf("%d ",dqlist.removeLast());
	    }
	    System.out.printf("\n");
	    System.out.printf((dqlist.getTail()==null?"true\n":"false\n"));
	    System.out.printf((dqlist.getHead()==null?"true\n":"false\n"));
	    for(int i=30;i<=46;i++){
	    	if(i%2==0)dqlist.insertLast(i);
	    	else dqlist.insertFirst(i);
	    }
	    for(int aux:dqlist){
	    	System.out.printf("%d ",aux);
	    }
	    dqlist.clear();
	    System.out.printf("\nSize: %d\n",dqlist.getSize());
	    for(int aux : dqlist){
	    	System.out.printf("%d ",aux);
	    }
	    for(int i=47;i<=76;i++){
	    	if(i%2==0)dqlist.insertFirst(i);
	    	else dqlist.insertLast(i);
	    }
	    System.out.printf("\nSize: %d\n",dqlist.getSize());
	    for(int aux : dqlist){
	    	System.out.printf("%d ",aux);
	    }
	}
	
	static void queue(){
	    QueueImp<Character> queue=new QueueImp<>();
	    for(char i='A';i<='Z';i++){
	        queue.enqueue(i);
	    }
	    for(char aux: queue){
	        System.out.printf("%c ", aux);
	    }
	    queue.dequeue();
	    System.out.printf("\n");
	    for(char aux: queue){
	    	System.out.printf("%c ", aux);
	    }
	    System.out.printf("\n%c\n",queue.peek());
	    while(!queue.isEmpty()){
	    	System.out.printf("%c ", queue.dequeue());
	    }
	    for(char i='a';i<='z';i++){
	        queue.enqueue(i);
	    }
	    System.out.printf("\n");
	    for(char aux: queue){
	    	System.out.printf("%c ", aux);
	    }
	    queue.clear();
	    System.out.printf("\nSize: %d\n",queue.size());
	    for(char aux: queue){
	    	System.out.printf("%c ", aux);
	    }
	    for(char i='z';i>='a';i--){
	        queue.enqueue(i);
	    }
	    System.out.printf("\nSize: %d\n",queue.size());
	    while(!queue.isEmpty()){
	    	System.out.printf("%c ", queue.dequeue());
	    }
	}
	
	static void stack(){
	    StackImp<Character> stack=new StackImp<>();
	    for(char i='A';i<='Z';i++){
	        stack.push(i);
	    }
	    for(char aux: stack){
	    	System.out.printf("%c ", aux);
	    }
	    stack.pop();
	    System.out.printf("\n");
	    for(char aux: stack){
	    	System.out.printf("%c ", aux);
	    }
	    System.out.printf("\n%c\n",stack.peek());
	    while(!stack.isEmpty()){
	    	System.out.printf("%c ", stack.pop());
	    }
	    for(char i='a';i<='z';i++){
	        stack.push(i);
	    }
	    System.out.printf("\n");
	    for(char aux : stack){
	    	System.out.printf("%c ",aux);
	    }
	    stack.clear();
	    System.out.printf("\nSize %d:\n ",stack.size());
	    for(char aux : stack){
	    	System.out.printf("%c ",aux);
	    }
	    for(char i='z';i>='a';i--){
	        stack.push(i);
	    }
	    System.out.printf("\nSize %d:\n",stack.size());
	    for(char aux : stack){
	    	System.out.printf("%c ",aux);
	    }
	    System.out.printf("\n");
	    while(!stack.isEmpty()){
	    	System.out.printf("%c ", stack.pop());
	    }
	}
	
	static void map(){
	    MyMap<Character,Integer> map=new MyMap<>();
	    for(char i='A';i<='M';i++){
	        map.put(i,(int)i);
	    }
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    System.out.printf("\n");
	    for(char i='A';i<='M';i++){
	    	System.out.printf("%c: %d\n",i,map.getValue(i));
	    }
	    System.out.printf("\n");
	    for(char i='A';i<='Z';i++){
	    	System.out.printf((map.containsKey(i)?"%c: true\n":"%c: false\n"),i);
	    }
	    for(char i='A';i<='Z';i++){
	        if(i<='M')map.remove(i);
	        else map.put(i,(int)i);
	    }
	    System.out.printf("\n");
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    int j=1;
	    for(char i='N';i<='Z';i++){
	        map.replace(i,j++);
	    }
	    System.out.printf("\n");
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    for(char i='N';i<='Z';i++){
	        map.put(i,--j);
	    }
	    System.out.printf("\n");
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    for(char i='N';i<='Z';i++){
	        map.remove(i);
	    }
	    for(char i='a';i<='z';i++){
	        map.put(i,(int)i);
	    }
	    System.out.printf("\n");
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    map.clear();
	    System.out.printf("\nSize: %d\n",map.getSize());
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	    map.put('V',22);
	    System.out.printf("\nSize: %d\n",map.getSize());
	    for(char aux: map.keySet()){
	    	System.out.printf("%c: %d\n",aux,map.getValue(aux));
	    }
	}
	
	static void graph() {
		MyGraph<String> graph=new MyGraph<>();
	    graph.addNode("Bogota");
	    graph.addNode("Cali");
	    graph.addNode("Cartagena");
	    graph.addEdge("Cali","Bogota",19);
	    graph.addEdge("Bogota","Cartagena",32);
	    graph.addEdge("Cartagena","Cali",8);
	    graph.addEdge("Cali","Cartagena",3);
	    graph.addEdge("Cartagena","Bogota",5);
	    for(int i=0;i<graph.getNumNodes();i++){
	        System.out.println(graph.numberToNode(i)+":");
	        for(int j=0;j<graph.getAdj().get(i).getSize();j++){
	            Vertex n=graph.getAdj().get(i).get(j);
	            System.out.print("["+graph.numberToNode(n.getNumber())+", "+n.getWeigth()+"] ");
	        }
	        System.out.println("\n");
	    }
	}
	
	static void bfs() {
		MyGraph<Character> graph=new MyGraph<>();
	    graph.addNode('A');
	    graph.addNode('B');
	    graph.addNode('C');
	    graph.addNode('D');
	    graph.addNode('F');
	    graph.addEdge('A','B',1);
	    graph.addEdge('A','C',1);
	    graph.addEdge('B','D',1);
	    graph.addEdge('B','F',1);
	    graph.addEdge('D','C',1);
	    graph.addEdge('D','F',1);
	    graph.addEdge('F','A',1);

	    char source='B';
	    
	    BreadthFirstSearch<Character> bfs=new BreadthFirstSearch<>(graph,source);
	    bfs.runSearch();
	    for(int i=0;i<graph.getNumNodes();i++){
	        char destination=graph.numberToNode(i);
	        if(bfs.obtainDistance(destination)!=-1){
	            System.out.printf("El camino mas corto del nodo %c al %c es:\n",source,destination);
	            String way="";
	            int current=i;
	            while(current!=-1){
	                way=graph.numberToNode(current)+way;
	                current=bfs.getPrevious()[current];
	            }
	            System.out.printf("Camino: ");
	            for(int j=0;j<way.length();j++){
	                char aux=way.charAt(j);
	                System.out.printf("%c ",aux);
	            }
	            System.out.printf("\nDistancia: %d\n\n",bfs.obtainDistance(destination));
	        }
	        else {
	        	System.out.printf("No hay camino del nodo %c al %c.\n\n",source,destination);
	        }
	    }
	}
	
	static void dfs() {
		
		MyGraph<Character> graph=new MyGraph<>();
	    graph.addNode('A');
	    graph.addNode('B');
	    graph.addNode('C');
	    graph.addNode('D');
	    graph.addNode('F');
	    graph.addNode('G');
	    graph.addNode('H');
	    graph.addNode('I');
	    graph.addNode('J');
	    graph.addNode('M');
	    graph.addEdge('A','B',1);
	    graph.addEdge('A','D',1);
	    graph.addEdge('A','C',1);
	    graph.addEdge('B','G',1);
	    graph.addEdge('B','F',1);
	    graph.addEdge('D','J',1);
	    graph.addEdge('D','M',1);
	    graph.addEdge('F','H',1);
	    graph.addEdge('F','I',1);
	    
	    char source='A';
	    
	    DeepFirstSearch<Character> dfs=new DeepFirstSearch<>(graph,source);
	    dfs.runSearch();

	    for(int i=0;i<graph.getNumNodes();i++){
	        char node=graph.numberToNode(i);
	        if(dfs.obtainDiscover(node)!=0){
	            System.out.printf("Tiempo descubrimiento nodo %c: %d\n",node,dfs.obtainDiscover(node));
	            System.out.printf("Tiempo terminacion nodo %c: %d\n\n",node,dfs.obtainTermination(node));
	        }
	        else{
	        	System.out.printf("No se puede llegar desde el origen %c a %c.\n\n",source,node);
	        }
	    }
		
	}
	
	static void bellmanFord() {
		MyGraph<Character> graph = new MyGraph<>();
	    graph.addNode('A');
	    graph.addNode('B');
	    graph.addNode('C');
	    graph.addNode('D');
	    graph.addNode('E');
	    graph.addNode('F');
	    graph.addEdge('A','B',3);
	    graph.addEdge('A','F',40);
	    graph.addEdge('B','E',3);
	    graph.addEdge('B','D',15);
	    graph.addEdge('D','E',20);
	    graph.addEdge('F','C',-3);
	    
	    char source='B';

	    BellmanFord<Character> bf=new BellmanFord<>(graph,source);
	    bf.initBellmanFord();
	    if(bf.isNegativeCicle()){
	        System.out.printf("Hay ciclo.");
	    }
	    else {
	        for(int i=0;i<graph.getNumNodes();i++){
	            char destination=graph.numberToNode(i);
	            if(bf.isPath(destination)){
	                int current=i;
	                String way="";
	                while(current!=-1){
	                    way=graph.numberToNode(current)+way;
	                    current=bf.getPrevious()[current];
	                }
	                System.out.printf("El camino mas corto del nodo %c al %c es:\n",source,destination);
	                for(int j=0;j<way.length();j++){
	                    char aux=way.charAt(j);
	                    System.out.printf("%c ",aux);
	                }
	                System.out.print("\nDistancia: "+bf.obtainDistance(destination)+"\n\n");
	            }
	            else {
	            	System.out.printf("No hay camino del nodo %c al %c.\n\n",source,destination);
	            }
	        }
	    }
	}
	
	static void bellmanFord2() {
		MyGraph<Character> graph=new MyGraph<>();
	    graph.addNode('A');
	    graph.addNode('B');
	    graph.addNode('C');
	    graph.addEdge('A','B',-1);
	    graph.addEdge('B','C',1);
	    graph.addEdge('C','A',-1);

	    char source='A';
	    
	    BellmanFord<Character> bf=new BellmanFord<>(graph,source);
	    bf.initBellmanFord();
	    if(bf.isNegativeCicle()){
	        System.out.printf("Hay ciclo.");
	    }
	    else {
	        for(int i=0;i<graph.getNumNodes();i++){
	            char destination=graph.numberToNode(i);
	            if(bf.isPath(destination)){
	                int current=i;
	                String way="";
	                while(current!=-1){
	                    way=graph.numberToNode(current)+way;
	                    current=bf.getPrevious()[current];
	                }
	                System.out.printf("El camino mas corto del nodo %c al %c es:\n",source,destination);
	                for(int j=0;j<way.length();j++){
	                    char aux=way.charAt(j);
	                    System.out.printf("%c ",aux);
	                }
	                System.out.print("\nDistancia: "+bf.obtainDistance(destination)+"\n\n");
	            }
	            else {
	            	System.out.printf("No hay camino del nodo %c al %c.\n\n",source,destination);
	            }
	        }
	    }
	}
	
	static void dijkstra() {
		MyGraph<Character> graph=new MyGraph<>();
	    graph.addNode('A');
	    graph.addNode('B');
	    graph.addNode('C');
	    graph.addNode('D');
	    graph.addNode('E');
	    graph.addNode('F');
	    graph.addNode('G');
	    graph.addNode('H');
	    graph.addNode('I');
	    graph.addNode('J');
	    graph.addNode('K');
	    graph.addNode('L');
	    graph.addNode('M');
	    graph.addNode('N');
	    graph.addNode('P');
	    graph.addEdge('A','B',8);
	    graph.addEdge('A','D',5);
	    graph.addEdge('A','E',4);
	    graph.addEdge('B','C',3);
	    graph.addEdge('B','F',4);
	    graph.addEdge('B','E',12);
	    graph.addEdge('D','E',9);
	    graph.addEdge('D','H',6);
	    graph.addEdge('F','G',1);
	    graph.addEdge('F','K',8);
	    graph.addEdge('F','E',3);
	    graph.addEdge('E','J',5);
	    graph.addEdge('E','I',8);
	    graph.addEdge('H','I',2);
	    graph.addEdge('H','M',7);
	    graph.addEdge('G','L',7);
	    graph.addEdge('G','K',8);
	    graph.addEdge('K','L',5);
	    graph.addEdge('K','P',7);
	    graph.addEdge('K','J',6);
	    graph.addEdge('J','N',9);
	    graph.addEdge('J','I',10);
	    graph.addEdge('I','M',6);
	    graph.addEdge('L','P',6);
	    graph.addEdge('P','N',17);
	    graph.addEdge('N','M',2);

	    char source='A';
	    
	    Dijkstra<Character> dj=new Dijkstra<>(graph,'A');
	    dj.runDijkstra();

	    for(int i=0;i<graph.getNumNodes();i++){
	         char destination=graph.numberToNode(i);
	        if(dj.isPath(destination)){
	            int current=i;
	            String way="";
	            while(current!=-1){
	                way=graph.numberToNode(current)+way;
	                current=dj.getPrevious()[current];
	            }
	            System.out.printf("El camino mas corto del nodo %c al %c es:\n",source,destination);
	            for(int j=0;j<way.length();j++){
	                char aux=way.charAt(j);
	                System.out.printf("%c ",aux);
	            }
	            System.out.print("\nDistancia: "+dj.obtainDistance(destination)+"\n\n");
	        }
	        else {
	        	System.out.printf("No hay camino del nodo %c al %c.\n\n",source,destination);
	        }
	    }
	}
	
	static void binaryTree(){
	    BinaryTree<Character> bt=new BinaryTree<>();
	    bt.insert('C');
	    bt.insert('F');
	    bt.insert('B');
	    bt.insert('D');
	    bt.insert('A');

	    System.out.printf("Caracteres:");
	    System.out.printf("\nInorder: ");
	    for(char aux : bt.inOrder()){
	    	System.out.printf("%c ",aux);
	    }
	    System.out.printf("\nPostorder: ");
	    for(char aux : bt.postOrder()){
	    	System.out.printf("%c ",aux);
	    }
	    System.out.printf("\nPreorder: ");
	    for(char aux : bt.preOrder()){
	    	System.out.printf("%c ",aux);
	    }
	    bt.clear();
	    
	    BinaryTree<Integer> bt2=new BinaryTree<>();
	    bt2.insert(5);
	    bt2.insert(4);
	    bt2.insert(7);
	    bt2.insert(2);
	    bt2.insert(11);

	    System.out.printf("\n\nNumeros:");
	    System.out.printf("\nInorder: ");
	    for(int aux : bt2.inOrder()){
	    	System.out.printf("%d ",aux);
	    }
	    System.out.printf("\nPostorder: ");
	    for(int aux : bt2.postOrder()){
	    	System.out.printf("%d ",aux);
	    }
	    System.out.printf("\nPreorder: ");
	    for(int aux : bt2.preOrder()){
	    	System.out.printf("%d ",aux);
	    }
	    bt2.clear();

	    BinaryTree<String> bt3=new BinaryTree<>();
	    bt3.insert("AC");
	    bt3.insert("AD");
	    bt3.insert("AF");
	    bt3.insert("AA");
	    bt3.insert("AE");

	    System.out.printf("\n\nString:");
	    System.out.printf("\nInorder: ");
	    for(String aux : bt3.inOrder()){
	        for(char c:aux.toCharArray())System.out.printf("%c",c);
	        System.out.printf(" ");
	    }
	    System.out.printf("\nPostorder: ");
	    for(String aux : bt3.postOrder()){
	        for(char c:aux.toCharArray())System.out.printf("%c",c);
	        System.out.printf(" ");
	    }
	    System.out.printf("\nPreorder: ");
	    for(String aux : bt3.preOrder()){
	        for(char c:aux.toCharArray())System.out.printf("%c",c);
	        System.out.printf(" ");
	    }
	    bt3.clear();
	}
	
	static void genericTree(){
	    GenericTree<String> gt=new GenericTree<>();
	    gt.addNode("A");
	    gt.addNode("A","B");
	    gt.addNode("A","C");
	    gt.addNode("A","D");
	    gt.addNode("B","E");
	    gt.addNode("B","F");
	    gt.addNode("D","G");
	    gt.addNode("D","H");
	    gt.addNode("D","I");
	    gt.levelOrder(gt.getRoot());
	    System.out.print("Level Order:\n");
	    for(int aux:gt.getLevels().keySet()){
	    	System.out.printf("Level %d:\n",aux);
	        for(String leave:gt.getLevels().getValue(aux)){
	            System.out.print(leave+" ");
	        }
	        System.out.print("\n\n");
	    }
	    System.out.print("PreOrder:\n");
	    for(String aux: gt.preOrder(gt.getRoot())){
	    	System.out.print(aux+" ");
	    }
	    System.out.print("\n\nPostOrder:\n");
	    for(String aux: gt.postOrder(gt.getRoot())){
	    	System.out.print(aux+" ");
	    }

	    gt.clear();
	    gt.addNode("a");
	    gt.addNode("a","b");
	    gt.addNode("a","c");
	    gt.addNode("a","d");
	    gt.addNode("b","e");
	    gt.addNode("b","f");
	    gt.addNode("d","g");
	    gt.addNode("d","h");
	    gt.addNode("d","i");
	    gt.levelOrder(gt.getRoot());
	    System.out.print("\n\nLevel Order:\n");
	    for(int aux:gt.getLevels().keySet()){
	    	System.out.printf("Level %d:\n",aux);
	        for(String leave:gt.getLevels().getValue(aux)){
	            System.out.print(leave+" ");
	        }
	        System.out.print("\n\n");
	    }
	    System.out.print("PreOrder:\n");
	    for(String aux: gt.preOrder(gt.getRoot())){
	    	System.out.print(aux+" ");
	    }
	    System.out.print("\n\nPostOrder:\n");
	    for(String aux: gt.postOrder(gt.getRoot())){
	    	System.out.print(aux+" ");
	    }
	}

	public static void main(String[] args) {
		genericTree();
	}

}
