import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaMenuComponent } from './lista-menu.component';

describe('ListaMenuComponent', () => {
  let component: ListaMenuComponent;
  let fixture: ComponentFixture<ListaMenuComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListaMenuComponent]
    });
    fixture = TestBed.createComponent(ListaMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
