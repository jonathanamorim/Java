Path path = Paths.get("C:\\Users\\Diego\\Documents\\NetBeansProjects\\MD Java Nio2\\arquivo.txt");
System.out.format("toString: %s%n", path.toString());
System.out.format("getFileName: %s%n", path.getFileName());
System.out.format("getName(0): %s%n", path.getName(0)); 
System.out.format("getNameCount: %d%n", path.getNameCount()); 
System.out.format("subpath(0,2): %s%n", path.subpath(0, 2)); 
System.out.format("getParent: %s%n", path.getParent()); 
System.out.format("getRoot: %s%n", path.getRoot());

toString: C:\Users\Diego\Documents\NetBeansProjects\MD Java Nio2\arquivo.txt
getFileName: arquivo.txt
getName(0): Users
getNameCount: 6
subpath(0,2): Users\Diego
getParent: C:\Users\Diego\Documents\NetBeansProjects\MD Java Nio2
getRoot: C:\

Path p1 = Paths.get("/home/logfile");
System.out.format("%s%n", p1.toUri()); 

if (args.length < 1) {
    System.out.println("usage: FileTest file");
    System.exit(-1);
}
// Converte a string de entrada para um objeto Path.
Path inputPath = Paths.get(args[0]);
Path fullPath = inputPath.toAbsolutePath(); 