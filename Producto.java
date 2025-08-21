public clases Producto{
  prívate int código;
  prívate String rubro;
  prívate String descripción;
  prívate double costo;
  prívate int stock;
  prívate double porcPtoRepo;
  prívate int existMinima;
  prívate Laboratorio laboratorio;
  
  Producto(int p_codigo, String p_rubro,           String p_descripcion, double p_costo, int      p_stock, double p_porc, int p_exist, Laboratorio p_lab){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setStock(0);
    this.setPorcPtoRepo(p_porc);
    this.setExistMinima(p_exist);
    this.setLaboratorio(p_lab);
  }

  Producto(int p_codigo, String p_rubro,           String p_descripcion, double p_costo, Laboratorio p_lab){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setStock(0);
    this.setPorcPtoRepo(0);
    this.setExistMinima(0);
    this.setLaboratorio(p_lab);
  }

  public void mostrar(){
    Systen.out.println(
    this.laboratorio.mostrar())
    Systen.out.println("Rubro: "+this.getRubro());
    Systen.out.println("Descripcion: "+this.getDescripcion());
    Systen.out.println("Precio contado: "+this.precioContado());
    Systen.out.println("Precio costo: "+this.getCosto());
    Systen.out.println("Stock: "+this.getStock()+" - "+ "Stock valorizado: $"+ this.stockValorizado());

  }

  public void ajuste(int p_cant){
    this.setStock(this.getStock() + p_cant);
  }

  public double stockValorizado(){
    double stock this.getStock()
    double costo this.getCosto()
    return stock * costo + costo * stock * 0.12;
  }

  public double precioLista(){
    return this.getCosto() * 1.12;
  }

  public double precioContado(){
    double precioLista = this.precioLista()
    return precioLista - precioLista * 0.05;
  }

  public String mostrarLinea(){
    return this.getDescripcion()+" "+this.precioLista()+" "this.precioContado();
  }

  public void ajustarPorcPtoRepo(double p_porce){
    this.setPorcPtoRepo(p_porce);
  }

  public void ajustarPorcPtoRepo(double p_porce){
    this.setPorcPtoRepo(p_porce);
  }

  