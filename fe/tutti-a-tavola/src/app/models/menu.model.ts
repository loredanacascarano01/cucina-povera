export interface Menu {
  idMenu: number;
  titolo: string;
  descrizione: string;
  pasti: Pasto[];
}

export interface Pasto {
  nome: string;
  giorno: string;
  note: string | null;
  portate: Portata[];
}

export interface Portata {
  idRicetta: number;
  nomeRicetta: string;
  numeroPersone: number;
}
export interface ElementoSpesa {
  nomeIngrediente: string;
  quantitaMinima: number;
  udm: string;
}

export interface Ricetta {
  id: number;
  nome: string;
}
