export interface Pasto {
  id_pasto: number;
  id_menu: number;
  nome_pasto: string;
  giorno: Date;
  veg: boolean;
  vegan: boolean;
  glufree: boolean;
  nomilk: boolean;
  halal: boolean;
  kosher: boolean;
}
