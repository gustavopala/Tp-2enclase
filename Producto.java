public class Producto{
  private int codigo;
  private String rubro;
  private String descripcion;
  private double costo;
  private int stock;
  private double porcPtoRepo;
  private int existMinima;
  private Laboratorio laboratorio;
  
  Producto(int p_codigo, String p_rubro,String p_descripcion, double p_costo, int p_stock, double p_porc, int p_exist, Laboratorio p_lab){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setStock(0);
    this.setPorcPtorepo(p_porc);
    this.setExistMinima(p_exist);
    this.setLaboratorio(p_lab);
  }

  
  Producto(int p_codigo, String p_rubro, String p_descripcion, double p_costo, Laboratorio p_lab){
    this.setCodigo(p_codigo);
    this.setRubro(p_rubro);
    this.setDescripcion(p_descripcion);
    this.setCosto(p_costo);
    this.setStock(0);
    this.setPorcPtorepo(0);
    this.setExistMinima(0);
    this.setLaboratorio(p_lab);
  }

  public int getCodigo(){ return this.codigo ;} 
  public String getRubro(){ return this.rubro ;}
  public String getDescripcion(){ return this.descripcion;}
  public double getCosto(){ return this.costo ;}
  public int getStock(){ return this.stock ;}
  public double getPorcPtorepo(){  return this.porcPtoRepo;}
  public int getExistMinima(){ return this.existMinima;}
  public Laboratorio getLaboratorio(){ return this.laboratorio;}
  
  
  private void setCodigo(int p_codigo){ this.codigo = p_codigo;}
  private void setRubro(String p_rubro){ this.rubro = p_rubro;}
  private void setDescripcion(String p_descripcion){ this.descripcion = p_descripcion;}
  private void setCosto(double p_costo){ this.costo = p_costo;}
  private void setStock(int p_stock) { this.stock = p_stock;}
  private void setPorcPtorepo(double p_porcPtoRepo) { this.porcPtoRepo = p_porcPtoRepo;}
  private void setExistMinima(int p_existMinima){ this.existMinima = p_existMinima;}
  private void setLaboratorio(Laboratorio p_laboratorio){ this.laboratorio = p_laboratorio;}
  
  public void mostrar(){
    System.out.println(this.getLaboratorio().mostrar());
    System.out.println("Rubro: "+this.getRubro());
    System.out.println("Descripcion: "+this.getDescripcion());
    System.out.println("Precio contado: "+this.precioContado());
    System.out.println("Precio costo: "+this.getCosto());
    System.out.println("Stock: "+this.getStock()+" - "+ "Stock valorizado: $"+ this.stockValorizado());

  }

  public void ajuste(int p_cant){
    this.setStock(this.getStock() + p_cant);
  }

  public double stockValorizado(){
    double stock = this.getStock();
    double costo = this.getCosto();
    return stock * costo + costo * stock * 0.12;
  }

  public double precioLista(){
    return this.getCosto() * 1.12;
  }

  public double precioContado(){
    double precioLista = this.precioLista();
    return precioLista - precioLista * 0.05;
  }

  public String mostrarLinea(){
    return this.getDescripcion()+" "+this.precioLista()+" "+this.precioContado();
  }

  public void ajustarPorcPtoRepo(double p_porce){
    this.setPorcPtorepo(p_porce);
  }

  

}
