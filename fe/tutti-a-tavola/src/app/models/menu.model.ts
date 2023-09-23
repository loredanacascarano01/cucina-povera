export interface Menu {
  idMenu: number,
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
  nomeRicetta: string;
  numeroPersone: number;
}
