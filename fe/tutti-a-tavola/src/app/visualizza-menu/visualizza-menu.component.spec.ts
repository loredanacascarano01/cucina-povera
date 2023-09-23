import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VisualizzaMenuComponent } from './visualizza-menu.component';

describe('VisualizzaMenuComponent', () => {
  let component: VisualizzaMenuComponent;
  let fixture: ComponentFixture<VisualizzaMenuComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VisualizzaMenuComponent]
    });
    fixture = TestBed.createComponent(VisualizzaMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
